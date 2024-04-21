package screeps.api

import kotlin.js.Date

external interface Market {
    val credits: Double
    val incomingTransactions: Array<Transaction>
    val orders: Record<String, Order>
    val outgoingTransactions: Array<Transaction>

    fun calcTransactionCost(amount: Int, roomName1: String, roomName2: String): Int
    fun cancelOrder(orderId: String): ScreepsReturnCode
    fun changeOrderPrice(orderId: String, newPrice: Double): ScreepsReturnCode
    fun createOrder(params: OrderCreationParams): ScreepsReturnCode

    fun deal(orderId: String, amount: Int, targetRoomName: String = definedExternally): ScreepsReturnCode
    fun extendOrder(orderId: String, addAmount: Int): ScreepsReturnCode
    fun getAllOrders(filter: Order.Filter = definedExternally): Array<Order>
    fun getAllOrders(filter: ((o: Order) -> Boolean) = definedExternally): Array<Order>

    /**
     * Get daily price history of the specified resource on the market for the last 14 days
     */
    fun getHistory(resourceType: TradableConstant?): Array<HistoryEntry>

    fun getAllOrders(): Array<Order>
    fun getOrderById(id: String): Order?

    interface Order {
        val id: String
        val created: Int
        val active: Boolean
        val type: OrderConstant
        val resourceType: TradableConstant
        val roomName: String
        val amount: Int
        val remainingAmount: Int
        val totalAmount: Int
        val price: Double

        interface Filter {
            var id: String?
            var created: Int?
            var type: OrderConstant?
            var resourceType: TradableConstant
            var roomName: String?
            var amount: Int?
            var remainingAmount: Int?
            var price: Double?
        }
    }

    interface Transaction {
        val transactionId: String
        val time: Int
        val sender: Owner
        val recipient: Owner
        val resourceType: TradableConstant
        val amount: Int
        val from: String
        val to: String
        val description: String
        val order: Order?

        interface Order {
            val id: String
            val type: OrderConstant
            val price: Double
        }
    }

    interface HistoryEntry {
        val resourceType: ResourceConstant
        val date: Date
        val transactions: Int
        val volume: Int
        val avgPrice: Float
        val stddevPrice: Float
    }
}

data class OrderCreationParams (
    @JsName("type")
    val type: OrderConstant,

    @JsName("resourceType")
    val resourceType: TradableConstant,

    @JsName("price")
    val price: Double,

    @JsName("totalAmount")
    val totalAmount: Int,

    @JsName("roomName")
    val roomName: String? = null
)