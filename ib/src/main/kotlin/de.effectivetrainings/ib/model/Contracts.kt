package de.effectivetrainings.ib.model

import com.ib.client.Contract
import com.ib.client.Types

class Contracts {

    companion object {
        fun newContract(symbol: String, secType: Types.SecType? = Types.SecType.STK, currenty: String? = "USD"): Contract
        {
            val c = Contract()
            c.symbol(symbol);
            c.secType(secType)
            c.currency(currenty)
            return c;
        }
    }
}
