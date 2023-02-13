/*
 * MIT License
 * Copyright (c) 2023 Cesario Jahrim Gabriele & Derevyanchenko Maxim & Felice Mirko & Kentpayeva Madina
 *
 * Full license description available at: https://github.com/jahrim/PPS-22-chess/blob/master/LICENSE
 */
package io.github.chess.adapters

import io.github.chess.ports.ChessPort
import io.vertx.core.Vertx

/** Helps the view communicate with the chess game. */
class ChessAdapter(override val port: ChessPort) extends AbstractAdapter[ChessPort]
