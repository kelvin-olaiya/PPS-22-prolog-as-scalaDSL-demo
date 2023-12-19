/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog

import io.github.chess.util.general.PrologEngine
import io.github.kelvindev15.prolog.PrologProgram

/** Represents the prolog rule to find all the coordinates in the south west direction from a starting position. */
class SWPrologRule extends PrologRule("sw_move") with InsideBoardRule():
  override protected val prologTheory: PrologProgram = prolog:
    programTheory:
      rule { theoryGoal(Xs, Ys, X, Y) :- theoryGoal(Xs, Ys, 1, X, Y) }
      rule { theoryGoal(Xs, Ys, N, X, Y) :- &&(X is (Xs - N), Y is (Ys - N)) }
      rule { theoryGoal(Xs, Ys, N, X, Y) :- &&(N1 is (N + 1), theoryGoal(Xs, Ys, N1, X, Y)) }
