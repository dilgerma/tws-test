package de.effectivetrainings.ib.impl.adapter

import com.ib.client.*
import de.tradery.adapter.ib.DataProcessor

class IbWrapper constructor(val dataProcessor: DataProcessor, val dataMapper: IbDataMapper) : IbWrapperAdapter() {

    override fun historicalData(reqId: Int, bar: Bar?) {

        bar ?: dataProcessor.onHistoricalDataReceived(dataMapper.mapBar(bar!!));
    }
}

abstract class IbWrapperAdapter : EWrapper {
    override fun tickByTickMidPoint(reqId: Int, time: Long, midPoint: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalData(reqId: Int, bar: Bar?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rerouteMktDepthReq(reqId: Int, conId: Int, exchange: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mktDepthExchanges(depthMktDataDescriptions: Array<out DepthMktDataDescription>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun histogramData(reqId: Int, items: MutableList<HistogramEntry>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickNews(tickerId: Int, timeStamp: Long, providerCode: String?, articleId: String?, headline: String?, extraData: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateAccountTime(timeStamp: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun verifyAndAuthMessageAPI(apiData: String?, xyzChallenge: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun newsProviders(newsProviders: Array<out NewsProvider>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openOrder(orderId: Int, contract: Contract?, order: Order?, orderState: OrderState?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateNewsBulletin(msgId: Int, msgType: Int, message: String?, origExchange: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickOptionComputation(tickerId: Int, field: Int, impliedVol: Double, delta: Double, optPrice: Double, pvDividend: Double, gamma: Double, vega: Double, theta: Double, undPrice: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun scannerParameters(xml: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun scannerDataEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun verifyMessageAPI(apiData: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun positionMulti(reqId: Int, account: String?, modelCode: String?, contract: Contract?, pos: Double, avgCost: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun contractDetailsEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun completedOrder(contract: Contract?, order: Order?, orderState: OrderState?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun connectAck() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateMktDepthL2(tickerId: Int, position: Int, marketMaker: String?, operation: Int, side: Int, price: Double, size: Int, isSmartDepth: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun receiveFA(faDataType: Int, xml: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalTicksBidAsk(reqId: Int, ticks: MutableList<HistoricalTickBidAsk>?, done: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun nextValidId(orderId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalNews(requestId: Int, time: String?, providerCode: String?, articleId: String?, headline: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updatePortfolio(contract: Contract?, position: Double, marketPrice: Double, marketValue: Double, averageCost: Double, unrealizedPNL: Double, realizedPNL: Double, accountName: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun securityDefinitionOptionalParameterEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun connectionClosed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pnl(reqId: Int, dailyPnL: Double, unrealizedPnL: Double, realizedPnL: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalTicksLast(reqId: Int, ticks: MutableList<HistoricalTickLast>?, done: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun completedOrdersEnd() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun accountUpdateMultiEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun familyCodes(familyCodes: Array<out FamilyCode>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun accountSummaryEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openOrderEnd() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun rerouteMktDataReq(reqId: Int, conId: Int, exchange: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun error(e: java.lang.Exception?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun error(str: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun error(id: Int, errorCode: Int, errorMsg: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun newsArticle(requestId: Int, articleType: Int, articleText: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun positionMultiEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pnlSingle(reqId: Int, pos: Int, dailyPnL: Double, unrealizedPnL: Double, realizedPnL: Double, value: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun contractDetails(reqId: Int, contractDetails: ContractDetails?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun securityDefinitionOptionalParameter(reqId: Int, exchange: String?, underlyingConId: Int, tradingClass: String?, multiplier: String?, expirations: MutableSet<String>?, strikes: MutableSet<Double>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun softDollarTiers(reqId: Int, tiers: Array<out SoftDollarTier>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun headTimestamp(reqId: Int, headTimestamp: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bondContractDetails(reqId: Int, contractDetails: ContractDetails?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickByTickAllLast(reqId: Int, tickType: Int, time: Long, price: Double, size: Int, tickAttribLast: TickAttribLast?, exchange: String?, specialConditions: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateMktDepth(tickerId: Int, position: Int, operation: Int, side: Int, price: Double, size: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun accountUpdateMulti(reqId: Int, account: String?, modelCode: String?, key: String?, value: String?, currency: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun currentTime(time: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun position(account: String?, contract: Contract?, pos: Double, avgCost: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun verifyAndAuthCompleted(isSuccessful: Boolean, errorText: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalNewsEnd(requestId: Int, hasMore: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun scannerData(reqId: Int, rank: Int, contractDetails: ContractDetails?, distance: String?, benchmark: String?, projection: String?, legsStr: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun execDetailsEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fundamentalData(reqId: Int, data: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickSize(tickerId: Int, field: Int, size: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalTicks(reqId: Int, ticks: MutableList<HistoricalTick>?, done: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickEFP(tickerId: Int, tickType: Int, basisPoints: Double, formattedBasisPoints: String?, impliedFuture: Double, holdDays: Int, futureLastTradeDate: String?, dividendImpact: Double, dividendsToLastTradeDate: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun accountDownloadEnd(accountName: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickGeneric(tickerId: Int, tickType: Int, value: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun positionEnd() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun verifyCompleted(isSuccessful: Boolean, errorText: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickString(tickerId: Int, tickType: Int, value: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateAccountValue(key: String?, value: String?, currency: String?, accountName: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun smartComponents(reqId: Int, theMap: MutableMap<Int, MutableMap.MutableEntry<String, Char>>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun orderStatus(orderId: Int, status: String?, filled: Double, remaining: Double, avgFillPrice: Double, permId: Int, parentId: Int, lastFillPrice: Double, clientId: Int, whyHeld: String?, mktCapPrice: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun orderBound(orderId: Long, apiClientId: Int, apiOrderId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deltaNeutralValidation(reqId: Int, deltaNeutralContract: DeltaNeutralContract?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun managedAccounts(accountsList: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun symbolSamples(reqId: Int, contractDescriptions: Array<out ContractDescription>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun marketDataType(reqId: Int, marketDataType: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun displayGroupUpdated(reqId: Int, contractInfo: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalDataEnd(reqId: Int, startDateStr: String?, endDateStr: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun historicalDataUpdate(reqId: Int, bar: Bar?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun marketRule(marketRuleId: Int, priceIncrements: Array<out PriceIncrement>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickReqParams(tickerId: Int, minTick: Double, bboExchange: String?, snapshotPermissions: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun displayGroupList(reqId: Int, groups: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickByTickBidAsk(reqId: Int, time: Long, bidPrice: Double, askPrice: Double, bidSize: Int, askSize: Int, tickAttribBidAsk: TickAttribBidAsk?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun execDetails(reqId: Int, contract: Contract?, execution: Execution?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun realtimeBar(reqId: Int, time: Long, open: Double, high: Double, low: Double, close: Double, volume: Long, wap: Double, count: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickPrice(tickerId: Int, field: Int, price: Double, attrib: TickAttrib?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun commissionReport(commissionReport: CommissionReport?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun tickSnapshotEnd(reqId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun accountSummary(reqId: Int, account: String?, tag: String?, value: String?, currency: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
