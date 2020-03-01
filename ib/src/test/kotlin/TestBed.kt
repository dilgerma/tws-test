import de.effectivetrainings.ib.impl.DataProcessorImpl
import de.effectivetrainings.ib.impl.adapter.IbConnection
import de.effectivetrainings.ib.impl.adapter.IbDataMapper
import de.effectivetrainings.ib.impl.adapter.IbWrapper

fun main(args: Array<String>) {
    val wrapper = IbWrapper(DataProcessorImpl(), IbDataMapper());
    val ibConnection = IbConnection.newConnection(wrapper).open();
}
