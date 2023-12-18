/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog
import io.github.kelvindev15.prolog.PrologProgram

/** Class representing the prolog rule that finds all capture moves of a white pawn. */
class WhitePawnCaptureRule extends PrologRule("white_pawn_capture") with InsideBoardFilterRule():
  val FD, RD = Seq("FD", "RD").map(varOf)
  override protected val prologTheory: PrologProgram = prolog {
    programTheory:
      rule { theoryGoal(F, R, FD, RD) :- &&(RD is R + 1, theoryGoal(F, R, FD, RD)) }
      rule { theoryGoal(F, R, FD, RD) :- FD is F + 1 }
      rule { theoryGoal(F, R, FD, RD) :- FD is F - 1 }
  }
