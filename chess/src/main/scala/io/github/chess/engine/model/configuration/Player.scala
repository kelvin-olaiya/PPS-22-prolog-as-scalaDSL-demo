/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.engine.model.configuration

import io.github.chess.engine.model.game.Team

/** Represents a player of the chess game. */
trait Player:

  /**
   * Returns the name of the player.
   * @return the name of the player
   */
  def name: String

  /**
   * Returns the [[Team]] of the player
   * @return the [[Team]] of the player
   */
  def team: Team
