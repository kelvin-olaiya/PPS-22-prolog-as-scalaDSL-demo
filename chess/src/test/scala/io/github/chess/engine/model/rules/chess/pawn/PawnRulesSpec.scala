/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.chess.pawn

import io.github.chess.engine.model.board.Position
import io.github.chess.engine.model.moves.{DoubleMove, EnPassantMove}

/** Test suit for all rules that a [[io.github.chess.model.pieces.Pawn]] should follow during a chess game. */
class PawnRulesSpec extends AbstractPawnSpec:

  val pawnCentralPosition: Position = (4, 3)

  "The pawn" should "be able to move one or two steps forward form the initial position" in:
    val pawnInitialPosition: Position = (4, 1)
    addPiece(pawnInitialPosition, whitePawn)
    val moves = PawnRule().findMoves(pawnInitialPosition, status)
    moves.map(_.to) should contain theSameElementsAs Set(
      pawnInitialPosition.rankUp(),
      pawnInitialPosition.rankUp().rankUp()
    )

  it should "be able to move only one step forward if it's not its initial position" in:
    addPiece(pawnCentralPosition, whitePawn)
    val moves = PawnRule().findMoves(pawnCentralPosition, status)
    moves.map(_.to) should contain theSameElementsAs Set(
      pawnCentralPosition.rankUp()
    )

  it should "be able to capture if there is an enemy on the adjacent diagonal position" in:
    val blackPawnPosition: Position = (5, 4)
    addPiece(pawnCentralPosition, whitePawn)
    addPiece(blackPawnPosition, blackPawn)

    val whiteMoves = PawnRule().findMoves(pawnCentralPosition, status)
    whiteMoves should have size 2
    whiteMoves.map(_.to) should contain(pawnCentralPosition.rankUp().fileForward())

    val blackMoves = PawnRule().findMoves(blackPawnPosition, status)
    blackMoves should have size 2
    blackMoves.map(_.to) should contain(blackPawnPosition.rankDown().fileBackward())

  it should "be able to capture an enemy pawn with the En Passant move, only if a DoubleMove was performed" in:
    val whitePawnPosition: Position = (4, 4)

    val blackPawnOnBoard = blackPawn
    val blackPawnMove = DoubleMove((5, 6), blackPawnOnBoard)

    val notCapturingPosition: Position = (3, 5)
    val capturingMove = EnPassantMove(whitePawnPosition, (5, 5), blackPawnMove.to, blackPawnOnBoard)

    addPiece(whitePawnPosition, whitePawn)
    addPiece(blackPawnMove.to, blackPawnOnBoard)

    val movesWithNoPrevDoubleMove = PawnRule().findMoves(whitePawnPosition, status)
    movesWithNoPrevDoubleMove should not contain capturingMove
    movesWithNoPrevDoubleMove.map(_.to) should not contain notCapturingPosition

    status = status.updateHistory(status.history.save(blackPawnOnBoard, blackPawnMove))

    val movesAfterDoubleMove = PawnRule().findMoves(whitePawnPosition, status)
    movesAfterDoubleMove should contain(capturingMove)
    movesAfterDoubleMove.map(_.to) should not contain notCapturingPosition

  it should "be unable to move forward if there is an enemy piece in the next cell" in:
    val blackPawnPosition: Position = (4, 4)
    addPiece(pawnCentralPosition, whitePawn)
    addPiece(blackPawnPosition, blackPawn)

    val whiteMoves = PawnRule().findMoves(pawnCentralPosition, status)
    whiteMoves should be(empty)

    val blackMoves = PawnRule().findMoves(blackPawnPosition, status)
    blackMoves should be(empty)

  it should "be unable to capture if there is an ally piece in the destination cell" in:
    val capturingPositionWithEnemy: Position = (3, 4)
    val capturingPositionWithAlly: Position = (5, 4)
    addPiece(pawnCentralPosition, whitePawn)
    addPiece(capturingPositionWithEnemy, blackPawn)
    addPiece(capturingPositionWithAlly, whitePawn)

    val move = PawnRule().findMoves(pawnCentralPosition, status)
    move should have size 2
    move.map(_.to) should contain(capturingPositionWithEnemy)
    move.map(_.to) should not contain capturingPositionWithAlly
