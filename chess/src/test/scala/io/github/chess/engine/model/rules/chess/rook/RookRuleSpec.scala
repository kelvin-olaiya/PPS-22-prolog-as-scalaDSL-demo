/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.chess.rook

import io.github.chess.engine.model.pieces.Rook
import io.github.chess.engine.model.board.ChessBoard.*
import io.github.chess.engine.model.board.{ChessBoard, File, Position, Rank}
import io.github.chess.engine.model.game.ChessGameStatus
import io.github.chess.engine.model.rules.AbstractChessRuleSpec

/** Test suite for [[Rook]]. */
class RookRuleSpec extends AbstractChessRuleSpec:
  val rookPosition: Position = Position(File.E, Rank._5)

  "The rook" should "move in all straight directions" in:
    val chessGameStatus: ChessGameStatus = ChessGameStatus(ChessBoard {
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | R | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
    })
    getChessBoardFromMoves(rookPosition, chessGameStatus) shouldEqual ChessBoard:
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      X | X | X | X | * | X | X | X
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *

  it should "be blocked by pieces of the same team" in:
    val chessGameStatus: ChessGameStatus = ChessGameStatus(ChessBoard {
      * | * | * | * | * | * | * | *
      * | * | * | * | K | * | * | *
      * | * | * | * | * | * | * | *
      * | * | Q | * | R | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | N | * | * | *
      * | * | * | * | * | * | * | *
    })
    getChessBoardFromMoves(rookPosition, chessGameStatus) shouldEqual ChessBoard:
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | X | * | X | X | X
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *

  it should "be able to capture pieces of the opposite team" in:
    val chessGameStatus: ChessGameStatus = ChessGameStatus(ChessBoard {
      * | * | * | * | * | * | * | *
      * | * | * | * | p | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | R | p | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | * | * | * | *
      * | * | * | * | p | * | * | *
    })
    getChessBoardFromMoves(rookPosition, chessGameStatus) shouldEqual ChessBoard:
      * | * | * | * | * | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      X | X | X | X | * | X | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
      * | * | * | * | X | * | * | *
