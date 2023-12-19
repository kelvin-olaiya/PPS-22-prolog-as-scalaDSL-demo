/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog

import io.github.kelvindev15.prolog.PrologProgram
import io.github.kelvindev15.prolog.dsl.DeclarativeProlog

/** Class representing the prolog rule that finds all moves in the East direction. */
class EPrologRule extends PrologRule("e_move") with InsideBoardRule():
  override val prologTheory: PrologProgram = prolog:
    programTheory:
      rule { theoryGoal(X1, Y1, X2, Y1) :- ||(X2 is (X1 + 1), theoryGoal(X1 + 1, Y1, X2, Y1)) }
