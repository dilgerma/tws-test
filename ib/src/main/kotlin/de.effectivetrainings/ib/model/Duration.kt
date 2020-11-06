package de.effectivetrainings.ib.model

import com.ib.client.Types

class Duration private constructor(val duration: Int, val durationUnit: Types.DurationUnit) {

    fun duration(): String {
        return "$duration W";
    }

    companion object {
        fun duration(duration: Int, durationUnit: Types.DurationUnit): Duration {
            return Duration(duration, durationUnit);
        }
    }
}
