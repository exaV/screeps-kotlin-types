package types.base.global

import types.base.prototypes.structures.Owner


//TODO test and improve Market type
external class Market {
    val credits: Number
    val incomingTransactions: Array<Transaction>
    val orders: dynamic
    val outgoingTransactions: Array<Transaction>
    fun calcTransactionCost(amount: Number, roomName1: String, roomName2: String): Number
    fun cancelOrder(orderId: String): Number
    fun changeOrderPrice(orderId: String, newPrice: Number): Number
    fun createOrder(type: String, resourceType: String, price: Number, totalAmount: Number, roomName: String? = definedExternally): Number
    fun deal(orderId: String, amount: Number, targetRoomName: String? = definedExternally /* null */): Number
    fun extendOrder(orderId: String, addAmount: Number): Number
    fun getAllOrders(filter: OrderFilter? = definedExternally /* null */): Array<Order>
    fun getAllOrders(filter: ((o: Order) -> Boolean)? = definedExternally /* null */): Array<Order>
    fun getOrderById(id: String): Order?
    fun getAllOrders(): Array<Order>
}

external interface Transaction {
    var transactionId: String
    var time: Number
    var sender: Owner
    var recipient: Owner
    var resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */
    var amount: Number
    var from: String
    var to: String
    var description: String
    var order: TransactionOrder? get() = definedExternally; set(value) = definedExternally
}

external interface Order {
    var id: String
    var created: Number
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var type: String
    var resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */
    var roomName: String? get() = definedExternally; set(value) = definedExternally
    var amount: Number
    var remainingAmount: Number
    var totalAmount: Number? get() = definedExternally; set(value) = definedExternally
    var price: Number
}

external interface TransactionOrder {
    var id: String
    var type: String
    var price: Number
}

external interface OrderFilter {
    var id: String? get() = definedExternally; set(value) = definedExternally
    var created: Number? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var resourceType: String
    var roomName: String? get() = definedExternally; set(value) = definedExternally
    var amount: Number? get() = definedExternally; set(value) = definedExternally
    var remainingAmount: Number? get() = definedExternally; set(value) = definedExternally
    var price: Number? get() = definedExternally; set(value) = definedExternally
}
