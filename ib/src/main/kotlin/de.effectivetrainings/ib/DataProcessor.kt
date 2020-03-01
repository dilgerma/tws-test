package de.tradery.adapter.ib;


import de.tradery.adapter.ib.model.Bar

interface DataProcessor {
    fun onHistoricalDataReceived(bar: Bar);
}
