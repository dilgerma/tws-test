package de.effectivetrainings.ib.model

import java.time.LocalDateTime
import java.util.*

class Dates {
    companion object {
        fun format(dateTime: LocalDateTime) : String {
//            return dateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss"));

            val gc = GregorianCalendar()

            gc.timeZone = TimeZone.getTimeZone("GMT")
            return "" +
                    gc[Calendar.YEAR] +
                    gc[Calendar.MONTH] + 1 +
                    gc[Calendar.DAY_OF_MONTH] + " " +
                    gc[Calendar.HOUR_OF_DAY] + ":" +
                    gc[Calendar.MINUTE] + ":" +
                    gc[Calendar.SECOND] + " " +
                    gc.timeZone.getDisplayName(false, TimeZone.SHORT)
        }
    }
}
