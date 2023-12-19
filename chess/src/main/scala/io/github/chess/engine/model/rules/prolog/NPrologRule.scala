/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog

import io.github.kelvindev15.prolog.PrologProgram
import io.github.kelvindev15.prolog.dsl.DeclarativeProlog

/** Class representing the prolog rule that finds all moves in the North direction. */
class NPrologRule extends PrologRule("n_move") with InsideBoardRule():
  override protected val prologTheory: PrologProgram = prolog:
    programTheory:
      rule { theoryGoal(X1, Y1, X1, Y2) :- ||(Y2 is (Y1 + 1), theoryGoal(X1, Y1 + 1, X1, Y2)) }
