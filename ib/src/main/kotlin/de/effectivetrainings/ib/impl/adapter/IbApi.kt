package de.effectivetrainings.ib.impl.adapter

import com.ib.client.Types
import de.effectivetrainings.ib.model.Contracts
import de.effectivetrainings.ib.model.Dates
import kotlin.random.Random

class IbApi private constructor(val ibConnection: IbConnection) {

    fun requuestHistoricalData(request: HistoricalDataRequest) {

        this.ibConnection.socket().eConnect("127.0.0.1", 7496, 12)
        this.ibConnection.socket().reqHistoricalData(
                Random.nextInt(),
                Contracts.newContract(request.symbol, request.secType),
                Dates.format(request.endDateTime),
                request.duration.toString(),
                request.barSize.toString(),
                Types.WhatToShow.TRADES.toString(),
                if(request.rth)  1  else 0,
                0,
                request.keepUpToDate,
                null
        )
    }


    companion object {
        fun connect(ibConnection: IbConnection): IbApi {
            return IbApi(ibConnection);
        }
    }
}
