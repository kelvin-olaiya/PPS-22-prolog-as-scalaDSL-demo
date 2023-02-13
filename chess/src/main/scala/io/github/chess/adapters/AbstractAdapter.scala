/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.adapters

import io.vertx.core.Vertx

/** Represents an adapter to help view communicate with the logic. */
trait AbstractAdapter[Port]:

  /**
   * Returns the port (controller) of the adapter
   * @return the port (controller)
   */
  def port: Port
