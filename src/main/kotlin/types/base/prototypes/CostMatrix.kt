package types.base.prototypes

// TODO how is naming resolved for soemthing like Pathfinder.CostMatrix ?
//TODO test serialize and deserialize. It's entirely possible that it doesn't work at all
external interface SerializedCostMatrix //actually Array<Int>

external class CostMatrix() {
    fun set(x: Int, y: Int, cost: Int)
    fun get(x: Int, y: Int): Int
    fun clone(): CostMatrix
    fun serialize(): SerializedCostMatrix

    companion object {
        fun deserialize(value: SerializedCostMatrix): CostMatrix
    }
}