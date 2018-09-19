package screeps.api

import screeps.api.structures.Structure
import screeps.api.structures.StructureSpawn
import kotlin.js.Json

external object Game {
    /**
     * A hash containing all your construction sites with their id as hash keys.
     */
    val constructionSites: StringDict<ConstructionSite>
    /**
     * An object containing information about your CPU usage
     */
    val cpu: CPU
    /**
     * A hash containing all your creeps with creep names as hash keys.
     */
    val creeps: StringDict<Creep>
    /**
     * A hash containing all your flags with flag names as hash keys.
     */
    val flags: StringDict<Flag>
    val gcl: GlobalControlLevel
    val map: GameMap
    val market: Market
    /**
     * An object with your global resources that are bound to the account, like subscription tokens.
     * Each object key is a resource constant, values are resources amounts.
     */
    val resources: StringDict<Int>
    /**
     * A hash containing all the rooms available to you with room names as hash keys.
     * A room is visible if you have a creep or an owned structure in it.
     */
    val rooms: StringDict<Room>
    /**
     * An object describing the world shard where your script is currently being executed in.
     */
    val shard: Shard
    /**
     * A hash containing all your spawns with spawn names as hash keys.
     */
    val spawns: StringDict<StructureSpawn>
    /**
     * A hash containing all your structures with structure id as hash keys.
     */
    val structures: StringDict<Structure>
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
}


private typealias ShardLimits = StringDict<Int>

external interface CPU {
    var limit: Int
    var tickLimit: Int
    var bucket: Int
    var shardLimits: ShardLimits
    /**
     * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
     */
    fun getUsed(): Double

    fun getHeapStatistics(): Json
    fun setShardLimits(limits: ShardLimits): ScreepsReturnCode
}


external interface GlobalControlLevel {
    var level: Int
    var progress: Int
    var progressTotal: Int
}


external interface Shard {
    var name: String
    var type: String
    var ptr: Boolean
}
