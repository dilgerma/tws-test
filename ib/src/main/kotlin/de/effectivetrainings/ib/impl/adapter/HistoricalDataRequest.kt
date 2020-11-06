package de.effectivetrainings.ib.impl.adapter

import com.ib.client.Types
import de.effectivetrainings.ib.model.Duration
import java.time.LocalDateTime

class HistoricalDataRequest constructor(val symbol: String, val secType: Types.SecType, val endDateTime: LocalDateTime, val duration: Duration, val barSize: Types.BarSize, val rth: Boolean, val keepUpToDate: Boolean) {
}
