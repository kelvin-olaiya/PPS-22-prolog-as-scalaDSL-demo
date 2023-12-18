/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog
import io.github.kelvindev15.prolog.PrologProgram

/** Class representing the prolog rule that finds all moves in the West direction. */
class WPrologRule extends PrologRule("w_move") with InsideBoardRule():
  private val X1, X2, Y1, Y2 = Seq("X1", "X2", "Y1", "Y2").map(varOf)
  override protected val prologTheory: PrologProgram = prolog {
    programTheory:
      rule { theoryGoal(X1, Y1, X2, Y1) :- X2 is X1 - 1; theoryGoal(X1 - 1, Y1, X2, Y1) }
  }
