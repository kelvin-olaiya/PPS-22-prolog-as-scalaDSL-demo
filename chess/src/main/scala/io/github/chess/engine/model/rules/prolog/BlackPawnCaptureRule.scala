/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog

import io.github.kelvindev15.prolog.PrologProgram
import io.github.kelvindev15.prolog.dsl.{DeclarativeProlog, PrologDSL}

/** Class representing the prolog rule that finds all capture moves of a black pawn. */
class BlackPawnCaptureRule extends PrologRule("black_pawn_capture") with InsideBoardFilterRule():
  override val prologTheory: PrologProgram = prolog:
    programTheory:
      rule:
        black_pawn_capture(F, R, FD, RD) :- &&(RD is (R - 1), pawn_capture_file(F, R, FD, RD))
      rule { pawn_capture_file(F, R, FD, RD) :- (FD is (F + 1)) }
      rule { pawn_capture_file(F, R, FD, RD) :- (FD is (F - 1)) }
