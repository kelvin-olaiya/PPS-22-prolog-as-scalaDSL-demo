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

  protected val prologTheory: PrologProgram

  /**
   * Generates new coordinates starting from a particular [[Position]].
   * @param position starting [[Position]]
   * @return a [[LazyList]] containing all the new coordinates
   */
  def findPositions(position: Position): LazyList[(Int, Int)] =
    val coords: (Int, Int) = position
    for
      solution <- Solver lazySolve (prologTheory withGoal theoryGoal(coords._1, coords._2, X, Y))
      if solution.isYes
      x <- solution(X)
      y <- solution(Y)
    yield (x.toString.toInt, y.toString.toInt)
