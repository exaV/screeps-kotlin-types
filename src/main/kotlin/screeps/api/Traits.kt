package screeps.api

import screeps.api.structures.Structure

external interface Identifiable {
    val id: String
}

external interface Harvestable {
    val ticksToRegeneration: Int
}

external interface Decaying {
    val ticksToDecay: Int
}

external interface Owned : OwnedNullable{
    override val owner: Owner
}

external interface OwnedNullable {
    val my: Boolean
    val owner: Owner?
}

external interface Owner {
    val username: String
}

external interface Attackable {
    val hits: Int
    val hitsMax: Int
}

external interface NavigationTarget
external interface HasPosition : NavigationTarget {
    val pos: RoomPosition
}

external interface EnergyContainer {
    val energy: Int
    val energyCapacity: Int
}

external interface Store {
    val store: StoreDefinition
    val storeCapacity: Int
}

external interface GenericCreep {
    val carry: StoreDefinition
    val carryCapacity: Int
    val memory: MemoryMarker
    val name: String
    val saying: String
    val ticksToLive: Int?

    fun drop(resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun move(direction: DirectionConstant): ScreepsReturnCode
    fun moveByPath(path: Array<Room.PathStep>): ScreepsReturnCode
    fun moveByPath(serializedPath: String): ScreepsReturnCode
    fun moveTo(target: NavigationTarget, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun moveTo(x: Int, y: Int, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun notifyWhenAttacked(enable: Boolean): ScreepsReturnCode
    fun pickup(target: Resource): ScreepsReturnCode
    fun say(message: String, toPublic: Boolean = definedExternally): ScreepsReturnCode
    fun suicide(): ScreepsReturnCode
    fun transfer(target: Structure, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun transfer(target: GenericCreep, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode

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

external interface MoveToOptions : FindPathOptions {
    val reusePath: Int? get() = definedExternally
    val serializeMemory: Boolean? get() = definedExternally
    val noPathFinding: Boolean? get() = definedExternally
    val visualizePathStyle: RoomVisual.Style? get() = definedExternally
}