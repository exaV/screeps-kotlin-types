@file:Suppress("unused")

package screeps.api

external object PathFinder {
    fun search(origin: RoomPosition, goal: RoomPosition, options: SearchOptions = definedExternally): Path
    fun search(origin: RoomPosition, goal: Array<RoomPosition>, options: SearchOptions = definedExternally): Path
    fun search(origin: RoomPosition, goal: GoalWithRange, options: SearchOptions = definedExternally): Path
    fun search(origin: RoomPosition, goal: Array<GoalWithRange>, options: SearchOptions = definedExternally): Path

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


    interface Path {
        val path: Array<RoomPosition>
        val ops: Int
        val cost: Int
        val incomplete: Boolean
    }
}

interface SearchOptions {
    var roomCallback: ((String) -> PathFinder.CostMatrix)?
    var plainCost: Int?
    var swampCost: Int?
    var flee: Boolean?
    var maxOps: Int?
    var maxRooms: Int?
    var maxCost: Int?
    var heuristicWeight: Double?
}

