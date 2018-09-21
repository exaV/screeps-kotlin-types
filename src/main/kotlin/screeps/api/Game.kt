package screeps.api

import screeps.api.structures.Structure
import screeps.api.structures.StructureSpawn
import screeps.utils.Result
import kotlin.js.Json

external object Game {
    /**
     * A hash containing all your construction sites with their id as hash keys.
     */
    val constructionSites: Record<String, ConstructionSite>
    /**
     * An object containing information about your CPU usage
     */
    val cpu: CPU
    /**
     * A hash containing all your creeps with creep names as hash keys.
     */
    val creeps: Record<String, Creep>
    /**
     * A hash containing all your flags with flag names as hash keys.
     */
    val flags: Record<String, Flag>
    val gcl: GCL
    val map: Map
    val market: Market
    /**
     * An object with your global resources that are bound to the account, like subscription tokens.
     * Each object key is a resource constant, values are resources amounts.
     */
    val resources: Record<String, Int>
    /**
     * A hash containing all the rooms available to you with room names as hash keys.
     * A room is visible if you have a creep or an owned structure in it.
     */
    val rooms: Record<String, Room>
    /**
     * An object describing the world shard where your script is currently being executed in.
     */
    val shard: Shard
    /**
     * A hash containing all your spawns with spawn names as hash keys.
     */
    val spawns: Record<String, StructureSpawn>
    /**
     * A hash containing all your structures with structure id as hash keys.
     */
    val structures: Record<String, Structure>
    /**
     * System game tick counter. It is automatically incremented on every tick. [Learn more][http://docs.screeps.com/game-loop.html]
     */
    val time: Int

    /**
     * Get an object with the specified unique ID. It may be a game object of any type.
     * Only objects from the rooms which are visible to you can be accessed.
     */
    fun <T : GameObject> getObjectById(id: String?): T?

    /**
     * Send a custom message at your profile email.
     * This way, you can set up notifications to yourself on any occasion within the game.
     * You can schedule up to 20 notifications during one game tick. Not available in the Simulation Room.
     */
    fun notify(message: String, groupInterval: Int = definedExternally)

    interface CPU {
        val limit: Int
        val tickLimit: Int
        val bucket: Int
        val shardLimits: Record<String, Int>
        /**
         * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
         */
        fun getUsed(): Double

        fun getHeapStatistics(): Json
        fun setShardLimits(limits: Record<String, Int>): ScreepsReturnCode
    }

    interface GCL {
        val level: Int
        val progress: Int
        val progressTotal: Int
    }

    interface Shard {
        val name: String
        val type: String
        val ptr: Boolean
    }

    interface Map {
        fun describeExits(roomName: String): Record<DirectionConstant, String>
        fun findExit(fromRoom: String, toRoom: String, opts: RouteOptions? = definedExternally): ExitConstant
        fun getRoomLinearDistance(roomName1: String, roomName2: String, continuous: Boolean? = definedExternally): Int
        fun getTerrainAt(x: Int, y: Int, roomName: String): TerrainConstant
        fun getTerrainAt(pos: RoomPosition): TerrainConstant
        fun getWorldSize(): Int
        fun isRoomAvailable(roomName: String): Boolean

        interface RouteResult {
            val exit: ExitConstant
            val room: String
        }

        interface RouteOptions {
            var routeCallback: (roomName: String, fromRoomName: String) -> Double
        }
    }
}

fun Game.Map.findRoute(
    fromRoom: String,
    toRoom: String,
    opts: Game.Map.RouteOptions? = null
): Result<ScreepsReturnCode, Array<Game.Map.RouteResult>> {
    val res = this.asDynamic().findRoute(fromRoom, toRoom, opts)
    return if (res is Array<*>) Result.Value(res.unsafeCast<Array<Game.Map.RouteResult>>())
    else Result.Error(res.unsafeCast<ScreepsReturnCode>())
}


