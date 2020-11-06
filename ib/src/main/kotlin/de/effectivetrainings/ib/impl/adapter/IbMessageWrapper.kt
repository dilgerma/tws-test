package de.effectivetrainings.ib.impl.adapter

import com.ib.client.*
import de.tradery.adapter.ib.DataProcessor

class IbMessageWrapper constructor(val dataProcessor: DataProcessor, val dataMapper: IbDataMapper) : IbWrapperAdapter() {

    override fun historicalData(reqId: Int, bar: Bar?) {
        bar ?: dataProcessor.onHistoricalDataReceived(dataMapper.mapBar(bar!!));
        println(bar)
    }
}

abstract class IbWrapperAdapter : EWrapper {
    override fun tickByTickMidPoint(reqId: Int, time: Long, midPoint: Double) {
    }

    override fun historicalData(reqId: Int, bar: Bar?) {
    }

    override fun rerouteMktDepthReq(reqId: Int, conId: Int, exchange: String?) {
    }

    override fun mktDepthExchanges(depthMktDataDescriptions: Array<out DepthMktDataDescription>?) {
    }

    override fun histogramData(reqId: Int, items: MutableList<HistogramEntry>?) {
    }

    override fun tickNews(tickerId: Int, timeStamp: Long, providerCode: String?, articleId: String?, headline: String?, extraData: String?) {
    }

    override fun updateAccountTime(timeStamp: String?) {
    }

    override fun verifyAndAuthMessageAPI(apiData: String?, xyzChallenge: String?) {
    }

    override fun newsProviders(newsProviders: Array<out NewsProvider>?) {
    }

    override fun openOrder(orderId: Int, contract: Contract?, order: Order?, orderState: OrderState?) {
    }

    override fun updateNewsBulletin(msgId: Int, msgType: Int, message: String?, origExchange: String?) {
    }

    override fun tickOptionComputation(tickerId: Int, field: Int, impliedVol: Double, delta: Double, optPrice: Double, pvDividend: Double, gamma: Double, vega: Double, theta: Double, undPrice: Double) {
    }

    override fun scannerParameters(xml: String?) {
    }

    override fun scannerDataEnd(reqId: Int) {
    }

    override fun verifyMessageAPI(apiData: String?) {
    }

    override fun positionMulti(reqId: Int, account: String?, modelCode: String?, contract: Contract?, pos: Double, avgCost: Double) {
    }

    override fun contractDetailsEnd(reqId: Int) {
    }

    override fun completedOrder(contract: Contract?, order: Order?, orderState: OrderState?) {
    }

    override fun connectAck() {
    }

    override fun updateMktDepthL2(tickerId: Int, position: Int, marketMaker: String?, operation: Int, side: Int, price: Double, size: Int, isSmartDepth: Boolean) {
    }

    override fun receiveFA(faDataType: Int, xml: String?) {
    }

    override fun historicalTicksBidAsk(reqId: Int, ticks: MutableList<HistoricalTickBidAsk>?, done: Boolean) {
    }

    override fun nextValidId(orderId: Int) {
    }

    override fun historicalNews(requestId: Int, time: String?, providerCode: String?, articleId: String?, headline: String?) {
    }

    override fun updatePortfolio(contract: Contract?, position: Double, marketPrice: Double, marketValue: Double, averageCost: Double, unrealizedPNL: Double, realizedPNL: Double, accountName: String?) {
    }

    override fun securityDefinitionOptionalParameterEnd(reqId: Int) {
    }

    override fun connectionClosed() {
    }

    override fun pnl(reqId: Int, dailyPnL: Double, unrealizedPnL: Double, realizedPnL: Double) {
    }

    override fun historicalTicksLast(reqId: Int, ticks: MutableList<HistoricalTickLast>?, done: Boolean) {
    }

    override fun completedOrdersEnd() {
    }

    override fun accountUpdateMultiEnd(reqId: Int) {
    }

    override fun familyCodes(familyCodes: Array<out FamilyCode>?) {
    }

    override fun accountSummaryEnd(reqId: Int) {
    }

    override fun openOrderEnd() {
    }

    override fun rerouteMktDataReq(reqId: Int, conId: Int, exchange: String?) {
    }

    override fun error(e: java.lang.Exception?) {
        e?.printStackTrace()
    }

    override fun error(str: String?) {
        println(str)
    }

    override fun error(id: Int, errorCode: Int, errorMsg: String?) {
        println(errorMsg)

    }

    override fun newsArticle(requestId: Int, articleType: Int, articleText: String?) {

    }

    override fun positionMultiEnd(reqId: Int) {

    }

    override fun pnlSingle(reqId: Int, pos: Int, dailyPnL: Double, unrealizedPnL: Double, realizedPnL: Double, value: Double) {

    }

    override fun contractDetails(reqId: Int, contractDetails: ContractDetails?) {
    }

    override fun securityDefinitionOptionalParameter(reqId: Int, exchange: String?, underlyingConId: Int, tradingClass: String?, multiplier: String?, expirations: MutableSet<String>?, strikes: MutableSet<Double>?) {

    }

    override fun softDollarTiers(reqId: Int, tiers: Array<out SoftDollarTier>?) {

    }

    override fun headTimestamp(reqId: Int, headTimestamp: String?) {

    }

    override fun bondContractDetails(reqId: Int, contractDetails: ContractDetails?) {

    }

    override fun tickByTickAllLast(reqId: Int, tickType: Int, time: Long, price: Double, size: Int, tickAttribLast: TickAttribLast?, exchange: String?, specialConditions: String?) {

    }

    override fun updateMktDepth(tickerId: Int, position: Int, operation: Int, side: Int, price: Double, size: Int) {

    }

    override fun accountUpdateMulti(reqId: Int, account: String?, modelCode: String?, key: String?, value: String?, currency: String?) {

    }

    override fun currentTime(time: Long) {

    }

    override fun position(account: String?, contract: Contract?, pos: Double, avgCost: Double) {

    }

    override fun verifyAndAuthCompleted(isSuccessful: Boolean, errorText: String?) {

    }

    override fun historicalNewsEnd(requestId: Int, hasMore: Boolean) {

    }

    override fun scannerData(reqId: Int, rank: Int, contractDetails: ContractDetails?, distance: String?, benchmark: String?, projection: String?, legsStr: String?) {

    }

    override fun execDetailsEnd(reqId: Int) {

    }

    override fun fundamentalData(reqId: Int, data: String?) {

    }

    override fun tickSize(tickerId: Int, field: Int, size: Int) {

    }

    override fun historicalTicks(reqId: Int, ticks: MutableList<HistoricalTick>?, done: Boolean) {

    }

    override fun tickEFP(tickerId: Int, tickType: Int, basisPoints: Double, formattedBasisPoints: String?, impliedFuture: Double, holdDays: Int, futureLastTradeDate: String?, dividendImpact: Double, dividendsToLastTradeDate: Double) {

    }

    override fun accountDownloadEnd(accountName: String?) {

    }

    override fun tickGeneric(tickerId: Int, tickType: Int, value: Double) {

    }

    override fun positionEnd() {

    }

    override fun verifyCompleted(isSuccessful: Boolean, errorText: String?) {

    }

    override fun tickString(tickerId: Int, tickType: Int, value: String?) {

    }

    override fun updateAccountValue(key: String?, value: String?, currency: String?, accountName: String?) {

    }

    override fun smartComponents(reqId: Int, theMap: MutableMap<Int, MutableMap.MutableEntry<String, Char>>?) {

    }

    override fun orderStatus(orderId: Int, status: String?, filled: Double, remaining: Double, avgFillPrice: Double, permId: Int, parentId: Int, lastFillPrice: Double, clientId: Int, whyHeld: String?, mktCapPrice: Double) {

    }

    override fun orderBound(orderId: Long, apiClientId: Int, apiOrderId: Int) {

    }

    override fun deltaNeutralValidation(reqId: Int, deltaNeutralContract: DeltaNeutralContract?) {

    }

    override fun managedAccounts(accountsList: String?) {
    }

    override fun symbolSamples(reqId: Int, contractDescriptions: Array<out ContractDescription>?) {

    }

    override fun marketDataType(reqId: Int, marketDataType: Int) {

    }

    override fun displayGroupUpdated(reqId: Int, contractInfo: String?) {

    }

    override fun historicalDataEnd(reqId: Int, startDateStr: String?, endDateStr: String?) {

    }

    override fun historicalDataUpdate(reqId: Int, bar: Bar?) {

    }

    override fun marketRule(marketRuleId: Int, priceIncrements: Array<out PriceIncrement>?) {

    }

    override fun tickReqParams(tickerId: Int, minTick: Double, bboExchange: String?, snapshotPermissions: Int) {

    }

    override fun displayGroupList(reqId: Int, groups: String?) {

    }

    override fun tickByTickBidAsk(reqId: Int, time: Long, bidPrice: Double, askPrice: Double, bidSize: Int, askSize: Int, tickAttribBidAsk: TickAttribBidAsk?) {

    }

    override fun execDetails(reqId: Int, contract: Contract?, execution: Execution?) {

    }

    override fun realtimeBar(reqId: Int, time: Long, open: Double, high: Double, low: Double, close: Double, volume: Long, wap: Double, count: Int) {

    }

    override fun tickPrice(tickerId: Int, field: Int, price: Double, attrib: TickAttrib?) {

    }

    override fun commissionReport(commissionReport: CommissionReport?) {

    }

    override fun tickSnapshotEnd(reqId: Int) {

    }

    override fun accountSummary(reqId: Int, account: String?, tag: String?, value: String?, currency: String?) {

    }

}
