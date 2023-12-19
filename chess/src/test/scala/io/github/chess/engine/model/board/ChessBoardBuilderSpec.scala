/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.board

import io.github.chess.AbstractSpec
import io.github.chess.engine.model.board.ChessBoardBuilder.*
import io.github.chess.engine.model.game.Team
import io.github.chess.engine.model.pieces.{Pawn, Piece}
import io.github.chess.util.scala.option.OptionExtension.given

import java.lang.IllegalStateException

/** Test suit for the [[ChessBoardBuilder]]. */
class ChessBoardBuilderSpec extends AbstractSpec:

  "A chess board builder" should "produce an empty chess board if not configured" in:
    ChessBoardBuilder().build shouldEqual ChessBoard.empty

  it should "produce the specified chess board if configured" in:
    val chessBoardBuilder =
      ChessBoardBuilder()
        .setNextCell(whitePawn)
        .setNextCell(whitePawn)
        .setNextCell(None)
        .setNextCell(blackPawn)
        .nextRow()
        .setNextCell(None)
        .setNextCell(None)
        .setNextCell(blackPawn)
    chessBoardBuilder.build shouldEqual ChessBoard:
      P | P | * | p | * | * | * | *
      * | * | p | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *

  it should "provide a lighter configuration syntax" in:
    val chessBoardBuilder =
      ChessBoardBuilder()
        .nextRow()
        .setNextCell(whitePawn)
        .setNextCell(None)
        .setNextCell(blackPawn)
        .nextRow()
        .nextRow()
        .setNextCell(whitePawn)
    val otherChessBoardBuilder =
      ChessBoardBuilder()
        - 1
        + whitePawn
        + None
        + blackPawn
        - 2
        + whitePawn
    chessBoardBuilder.build shouldEqual otherChessBoardBuilder.build

  it should s"throw an illegal state exception when trying to fill more than ${ChessBoard.NumberOfPositions} cells" in:
    val chessBoardBuilder = ChessBoardBuilder().nextRow(8)
    an[IllegalStateException] should be thrownBy { chessBoardBuilder.setNextCell(whitePawn) }

  /** @return a new white pawn */
  private def whitePawn: Piece = Pawn(Team.WHITE)

  /** @return a new black pawn */
  private def blackPawn: Piece = Pawn(Team.BLACK)
