package screeps.api

import screeps.api.structures.Owner


//TODO test and improve Market type
external class Market {
    val credits: Number
    val incomingTransactions: Array<Transaction>
    val orders: dynamic
    val outgoingTransactions: Array<Transaction>
    fun calcTransactionCost(amount: Number, roomName1: String, roomName2: String): Number
    fun cancelOrder(orderId: String): Number
    fun changeOrderPrice(orderId: String, newPrice: Number): Number
    fun createOrder(
        type: String,
        resourceType: String,
        price: Number,
        totalAmount: Number,
        roomName: String? = definedExternally
    ): Number

    fun deal(orderId: String, amount: Number, targetRoomName: String? = definedExternally): Number
    fun extendOrder(orderId: String, addAmount: Number): Number
    fun getAllOrders(filter: OrderFilter? = definedExternally): Array<Order>
    fun getAllOrders(filter: ((o: Order) -> Boolean)? = definedExternally): Array<Order>
    fun getOrderById(id: String): Order?
    fun getAllOrders(): Array<Order>
}

external interface Transaction {
    var transactionId: String
    var time: Number
    var sender: Owner
    var recipient: Owner
    var resourceType: dynamic
    var amount: Number
    var from: String
    var to: String
    var description: String
    var order: TransactionOrder? get() = definedExternally; set(value) = definedExternally
}

external interface Order {
    var id: String
    var created: Number
    var active: Boolean?
    var type: String
    var resourceType: dynamic
    var roomName: String?
    var amount: Number
    var remainingAmount: Number
    var totalAmount: Number?
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
