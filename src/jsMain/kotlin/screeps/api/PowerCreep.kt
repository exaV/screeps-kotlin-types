package screeps.api

import screeps.api.structures.StructureController
import screeps.api.structures.StructurePowerBank
import screeps.api.structures.StructurePowerSpawn

abstract external class PowerCreep: GenericCreep {
    companion object {
        fun create(name: String, className: PowerClassConstant): ScreepsReturnCode
    }

    val className: PowerClassConstant
    val deleteTime: Int?
    val level: Int
    override val memory: PowerCreepMemory


    val powers : Record<PowerEffectConstant, Power>
    val shard: String?
    val spawnCooldownTime: Int?

    fun cancelOrder(methodName: String): ScreepsReturnCode
    fun delete(cancel: Boolean = definedExternally): ScreepsReturnCode
    fun enableRoom(controller: StructureController): ScreepsReturnCode
    fun rename(name: String): ScreepsReturnCode
    fun renew(target: StructurePowerBank): ScreepsReturnCode
    fun renew(target: StructurePowerSpawn): ScreepsReturnCode
    fun spawn(powerSpawn: StructurePowerSpawn): ScreepsReturnCode
    fun upgrade(power: PowerEffectConstant): ScreepsReturnCode
    fun usePower(power: PowerEffectConstant): ScreepsReturnCode
    fun usePower(power: PowerEffectConstant, target: RoomObject = definedExternally): ScreepsReturnCode
    fun usePower(power: PowerEffectConstant, target: RoomPosition = definedExternally): ScreepsReturnCode
 }

external interface Power {
    val level: Int
    val cooldown: Int?
}
