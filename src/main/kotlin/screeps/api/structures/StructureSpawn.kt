package screeps.api.structures

import screeps.api.*

abstract external class StructureSpawn : OwnedStructure, EnergyStructure {
    val memory: SpawnMemory
    val name: String

    val spawning: Spawning?

    /**
     * Start the creep spawning process. The required energy amount can be withdrawn from all spawns and utils in the room.
     */
    fun spawnCreep(body: Array<BodyPartConstant>, name: String): ScreepsReturnCode

    /**
     * Start the creep spawning process. The required energy amount can be withdrawn from all spawns and utils in the room.
     */
    fun spawnCreep(body: Array<BodyPartConstant>, name: String, opts: SpawnOptions): ScreepsReturnCode

    /**
     * Kill the creep and drop up to 100% of resources spent on its spawning and boosting depending on remaining life time.
     * The target should be at adjacent square.
     */
    fun recycleCreep(target: Creep): ScreepsReturnCode

    /**
     * Increase the remaining time to live of the target creep. The target should be at adjacent square.
     * The spawn should not be busy with the spawning process.
     * Each execution increases the creep's timer by amount of ticks according to this formula:
     *
     *
     * `floor(600/body_size)`
     *
     * Energy required for each execution is determined using this formula:
     *
     * `ceil(creep_cost/2.5/body_size)`
     *
     * Renewing a creep removes all of its boosts.
     */
    fun renewCreep(target: Creep): ScreepsReturnCode
}

external class Spawning {
    val directions: Array<DirectionConstant>
    val name: String
    val needTime: Int
    val remainingTime: Int

    fun cancel(): ScreepsReturnCode
}

interface SpawnOptions {
    val memory: CreepMemory?
}

open class FullSpawnOptions(
    override val memory: CreepMemory? = null,
    open val energyContainingStructure: Array<EnergyStructure>? = null,
    open val dryRun: Boolean = false,
    open val directions: Array<DirectionConstant>? = null
) : SpawnOptions