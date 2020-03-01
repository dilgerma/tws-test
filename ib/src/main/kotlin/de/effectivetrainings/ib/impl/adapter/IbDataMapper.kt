package de.effectivetrainings.ib.impl.adapter

import com.ib.client.Bar
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class IbDataMapper {

    fun mapBar(bar: Bar): de.tradery.adapter.ib.model.Bar {
        val date: LocalDateTime = LocalDateTime.parse(bar.time(), DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss"))
        return de.tradery.adapter.ib.model.Bar(date, bar.open(), bar.high(), bar.low(), bar.close(), bar.volume(), bar.count(), bar.wap());
    }
}
