/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.rules.prolog

import alice.tuprolog.Theory
import io.github.chess.engine.model.board.Position
import Position.given
import io.github.chess.util.general.PrologEngine.given
import io.github.chess.util.general.PrologEngine
import io.github.kelvindev15.prolog.PrologProgram
import io.github.kelvindev15.prolog.dsl.{DeclarativeProlog, PrologDSL}
import io.github.kelvindev15.prolog.solver.Solver

/**
 * Represents a Prolog rule that must be structured in the following way:
 *
 * name_of_the_rule(SF, SR, AF, AR) :- ...
 *
 * where:
 *  - name_of_the_rule must be equal to its filename and so to the overridden theory
 *  - SF is Starting File
 *  - SR is Starting Rank
 *  - AF is Arrival File
 *  - AR is Arrival Rank
 */
trait PrologRule(val theoryGoal: String) extends PrologDSL with DeclarativeProlog:
  protected val prologTheory: PrologProgram = PrologProgram.emptyTheory
  protected val Xs = varOf("Xs")
  protected val Ys = varOf("Ys")
  protected val N1 = varOf("N1")
  protected val FS = varOf("FS")
  protected val RS = varOf("RS")
  protected val FD = varOf("FD")
  protected val RD = varOf("RD")
  protected val X1 = varOf("X1")
  protected val X2 = varOf("X2")
  protected val Y1 = varOf("Y1")
  protected val Y2 = varOf("Y2")

  protected val black_pawn_capture = "black_pawn_capture"
  protected val white_pawn_capture = "white_pawn_capture"
  protected val pawn_capture_file = "pawn_capture_file"

  /**
   * Generates new coordinates starting from a particular [[Position]].
   * @param position starting [[Position]]
   * @return a [[LazyList]] containing all the new coordinates
   */
  def findPositions(position: Position): LazyList[(Int, Int)] =
    val coords: (Int, Int) = position
    (Solver lazySolve (prologTheory withGoal theoryGoal(coords._1, coords._2, X, Y)))
      .map { solution => (solution(X), solution(Y)) }
      .collect { case (Some(x), Some(y)) => (x.toString.toInt, y.toString.toInt) }
