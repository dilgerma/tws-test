package de.tradery.adapter.ib.model;

import java.time.LocalDateTime;

data class Bar(val data: LocalDateTime, val open: Double, val high: Double, val low: Double, val close: Double, val volume: Long, val numberOfTrades: Int, val weightedAveragePrice: Double) {
}
