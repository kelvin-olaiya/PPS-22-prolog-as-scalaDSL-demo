/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.util.general

import java.util.concurrent.{Executors, ScheduledExecutorService, TimeUnit}
import scala.concurrent.duration.Duration
import scala.concurrent.duration.DurationInt

/** Represents a countdown timer that decrement the time remaining and executes every N seconds. */
trait Timer:

  /** Starts the timer. */
  def start(): Unit

  /** Stops the timer definitely. */
  def stop(): Unit

  /** Stops the timer and reinitialize it. */
  def reset(): Unit

  /** Continues running the timer. */
  def continue(): Unit

  /** Restarts the timer, as resetting and continue running it. */
  def restart(): Unit =
    this.reset()
    this.continue()

  /**
   * Returns true if the timer has ended, false otherwise.
   * @return true if the timer has ended, false otherwise
   */
  def ended: Boolean

  /**
   * Returns the time remaining as a [[Duration]].
   * @return the time remaining as a [[Duration]]
   */
  def timeRemaining: Duration

  /**
   * Sets the time remaining.
   * @param timeInMinutes time remaining in minutes
   */
  def setTime(timeInMinutes: Int): Unit

/** Factory for [[Timer]] instances. */
object Timer:

  /**
   * Creates a new [[Timer]].
   * @param startingMinutes starting time in minutes
   * @param runnable runnable to run every execution
   * @param decrement seconds to decrement the starting time
   * @return a new fresh [[Timer]]
   */
  def apply(startingMinutes: Int, runnable: () => Unit, decrement: Int = 1): Timer =
    TimerImpl(startingMinutes, decrement, runnable)

  private case class TimerImpl(
      private val startingMinutes: Int,
      private val decrement: Int,
      private val runnable: () => Unit
  ) extends Timer:

    private var executor: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor()
    private var startingTime = startingMinutes.minutes
    private var _timeRemaining = this.startingTime
    private final val Decrement = decrement.seconds

    override def start(): Unit =
      this.executor.scheduleAtFixedRate(
        () =>
          countdown()
          runnable()
        ,
        0,
        decrement,
        TimeUnit.SECONDS
      )

    override def stop(): Unit = this.executor.shutdownNow()

    override def reset(): Unit = this._timeRemaining = this.startingTime

    override def continue(): Unit =
      this.executor = Executors.newSingleThreadScheduledExecutor()
      this.start()

    override def ended: Boolean = this._timeRemaining == Duration.Zero

    override def timeRemaining: Duration = this._timeRemaining

    override def setTime(timeInMinutes: Int): Unit =
      this.startingTime = timeInMinutes.minutes
      this._timeRemaining = this.startingTime

    private def countdown(): Unit = this._timeRemaining = this._timeRemaining - Decrement
