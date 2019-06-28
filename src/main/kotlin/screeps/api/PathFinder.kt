package screeps.api

external object PathFinder {
    fun search(origin: RoomPosition, goal: RoomPosition, options: SearchOptions = definedExternally): Path
    fun search(origin: RoomPosition, goal: Array<RoomPosition>, options: SearchOptions = definedExternally): Path
    fun search(origin: RoomPosition, goal: GoalWithRange, options: SearchOptions = definedExternally): Path
    fun search(origin: RoomPosition, goal: Array<GoalWithRange>, options: SearchOptions = definedExternally): Path

    class CostMatrix : screeps.api.CostMatrix {
        fun set(x: Int, y: Int, cost: Int)
        fun get(x: Int, y: Int): Int
        fun clone(): CostMatrix
        fun serialize(): Array<Int>
        var _bits: Array<Int>

        companion object {
            fun deserialize(serializedCostMatrix: Array<Int>): CostMatrix
        }
    }

    interface GoalWithRange {
        var pos: RoomPosition
        var range: Int
    }


    interface Path {
        val path: Array<RoomPosition>
        val ops: Int
        val cost: Int
        val incomplete: Boolean
    }
}

external interface SearchOptions : Options {
    var roomCallback: ((String) -> CostMatrix)? get() = definedExternally; set(value) = definedExternally
    var plainCost: Int? get() = definedExternally; set(value) = definedExternally
    var swampCost: Int? get() = definedExternally; set(value) = definedExternally
    var flee: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxOps: Int? get() = definedExternally; set(value) = definedExternally
    var maxRooms: Int? get() = definedExternally; set(value) = definedExternally
    var maxCost: Int? get() = definedExternally; set(value) = definedExternally
    var heuristicWeight: Double? get() = definedExternally; set(value) = definedExternally
}
external interface CostMatrix

val COSTMATRIX_FALSE : CostMatrix = false.unsafeCast<CostMatrix>()