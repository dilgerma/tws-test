package de.effectivetrainings.ib.impl.adapter

import com.ib.client.EClientSocket
import com.ib.client.EJavaSignal
import com.ib.client.EReader

class IbConnection constructor(val ibMessageClient: IbMessageWrapper, val host:String? = "127.0.0.1", val port:Int? = 7496) {

    val clientSocket: EClientSocket;
    val javaSignal: EJavaSignal;
    val reader: EReader;
    var bgThread: Thread;

    init {
        this.javaSignal = EJavaSignal();
        this.clientSocket = EClientSocket(this.ibMessageClient, javaSignal);
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

    fun socket() : EClientSocket {
        return this.clientSocket;
    }

    companion object {
        fun newConnection(ibMessageClient: IbMessageWrapper, host: String?, port: Int?): IbConnection {
            return IbConnection(ibMessageClient, host, port).open();
        }
    }
}
