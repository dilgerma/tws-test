package de.effectivetrainings.ib.impl.adapter

import com.ib.client.EClientSocket
import com.ib.client.EJavaSignal
import com.ib.client.EReader

class IbConnection constructor(val ibClient: IbWrapper) {

    val clientSocket: EClientSocket;
    val javaSignal: EJavaSignal;
    val reader: EReader;
    var bgThread: Thread;

    init {
        this.javaSignal = EJavaSignal();
        this.clientSocket = EClientSocket(this.ibClient, javaSignal);
        this.reader = EReader(clientSocket, javaSignal)
        bgThread = Thread(Runnable {
                    while (clientSocket.isConnected) {
                        javaSignal.waitForSignal()
                        try {
                            reader.processMsgs()
                        } catch (e: Exception) {
                            println("Exception: " + e.message)
                            throw RuntimeException("cannot connect to TWS")
                        }
                    }
                })
    }

    fun open() : IbConnection{
        reader.start()
        this.bgThread.start()
        return this;
    }

    fun close() : IbConnection{
        reader.interrupt()
        bgThread.interrupt();
        return this;
    }

    companion object {
        fun newConnection(ibClient: IbWrapper): IbConnection {
            return IbConnection(ibClient);
        }
    }
}
