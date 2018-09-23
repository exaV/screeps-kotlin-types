@file:Suppress("unused")

package screeps.api

external object PathFinder {
    fun search(origin: RoomPosition, goal: RoomPosition, options: Options = definedExternally): Path
    fun search(origin: RoomPosition, goal: Array<RoomPosition>, options: Options = definedExternally): Path
    fun search(origin: RoomPosition, goal: GoalWithRange, options: Options = definedExternally): Path
    fun search(origin: RoomPosition, goal: Array<GoalWithRange>, options: Options = definedExternally): Path

    class CostMatrix {
        fun set(x: Int, y: Int, cost: Int)
        fun get(x: Int, y: Int): Int
        fun clone(): CostMatrix
        fun serialize(): Array<Int>

        companion object {
            fun deserialize(serializedCostMatrix: Array<Int>): CostMatrix
        }
    }

    interface GoalWithRange {
        var pos: RoomPosition
        var range: Int
    }


    interface Options {
        var roomCallback: ((String) -> CostMatrix)?
        var plainCost: Int?
        var swampCost: Int?
        var flee: Boolean?
        var maxOps: Int?
        var maxRooms: Int?
        var maxCost: Int?
        var heuristicWeight: Double?
    }

    interface Path {
        val path: Array<RoomPosition>
        val ops: Int
        val cost: Int
        val incomplete: Boolean
    }
}