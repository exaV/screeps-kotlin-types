package screeps.api

import screeps.api.structures.Structure
import screeps.api.structures.StructureController
import screeps.api.structures.StructurePowerBank
import screeps.api.structures.StructurePowerSpawn

abstract external class PowerCreep: RoomObject, Owned, Attackable, Identifiable {
    companion object {
        fun create(name: String, className: PowerClassConstant): ScreepsReturnCode
    }

    val carry: StoreDefinition
    val carryCapacity: Int
    val className: PowerClassConstant
    val deleteTime: Int?
    val level: Int
    val memory: PowerCreepMemory
    val name: String

    val powers : Record<PowerEffectConstant, Power>
    val saying: String
    val shard: String?
    val spawnCooldownTime: Int?
    val ticksToLive: Int?

    fun cancelOrder(methodName: String): ScreepsReturnCode
    fun delete(cancel: Boolean = definedExternally): ScreepsReturnCode
    fun drop(resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun enableRoom(controller: StructureController): ScreepsReturnCode
    fun move(direction: DirectionConstant): ScreepsReturnCode
    fun moveByPath(path: Array<Room.PathStep>): ScreepsReturnCode
    fun moveByPath(serializedPath: String): ScreepsReturnCode
    fun moveTo(target: NavigationTarget, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun moveTo(x: Int, y: Int, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun notifyWhenAttacked(enable: Boolean): ScreepsReturnCode
    fun pickup(target: Resource): ScreepsReturnCode
    fun rename(name: String): ScreepsReturnCode
    fun renew(target: StructurePowerBank): ScreepsReturnCode
    fun renew(target: StructurePowerSpawn): ScreepsReturnCode
    fun say(message: String, toPublic: Boolean = definedExternally): ScreepsReturnCode
    fun spawn(powerSpawn: StructurePowerSpawn): ScreepsReturnCode
    fun suicide(): ScreepsReturnCode
    fun transfer(target: Structure, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun transfer(target: Creep, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun upgrade(power: PowerEffectConstant): ScreepsReturnCode
    fun usePower(power: PowerEffectConstant): ScreepsReturnCode
    fun usePower(power: PowerEffectConstant, target: RoomObject = definedExternally): ScreepsReturnCode
    fun usePower(power: PowerEffectConstant, target: RoomPosition = definedExternally): ScreepsReturnCode
    fun withdraw(
            target: Structure,
            resourceType: ResourceConstant,
            amount: Int = definedExternally
    ): ScreepsReturnCode

    fun withdraw(
            target: Tombstone,
            resourceType: ResourceConstant,
            amount: Int = definedExternally
    ): ScreepsReturnCode
}

external interface Power {
    val level: Int
    val cooldown: Int?
}
