/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog
import io.github.kelvindev15.prolog.PrologProgram

/** Class representing the prolog rule that finds all moves in the North-West direction. */
class NWPrologRule() extends PrologRule("nw_move") with InsideBoardRule():
  private val FS, RS, FD, RD, X1 = Seq("FS", "RS", "FD", "RD", "X1").map(varOf)
  override protected val prologTheory: PrologProgram = prolog {
    programTheory:
      rule { theoryGoal(FS, RS, FD, RD) :- theoryGoal(FS, RS, 1, FD, RD) }
      rule { theoryGoal(FS, RS, X, FD, RD) :- &&(FD is FS - X, RD is RS + X) }
      rule { theoryGoal(FS, RS, X, FD, RD) :- &&(X1 is X + 1, theoryGoal(FS, RS, X1, FD, RD)) }
  }
