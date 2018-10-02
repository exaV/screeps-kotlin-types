package screeps.api

import screeps.api.structures.Structure
import screeps.api.structures.StructureController

abstract external class Creep : RoomObject, Owned, Attackable, Identifiable {
    val body: Array<BodyPart>
    val carry: StoreDefinition
    val carryCapacity: Int
    val fatigue: Int
    val memory: CreepMemory
    val name: String
    val saying: String
    val spawning: Boolean
    val ticksToLive: Int

    fun attack(target: Creep): ScreepsReturnCode
    fun attack(target: Structure): ScreepsReturnCode
    fun attackController(target: StructureController): ScreepsReturnCode
    fun build(target: ConstructionSite): ScreepsReturnCode
    fun cancelOrder(methodName: String): ScreepsReturnCode
    fun claimController(controller: StructureController): ScreepsReturnCode
    fun dismantle(target: Structure): ScreepsReturnCode
    fun drop(resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun generateSafeMode(target: StructureController): ScreepsReturnCode
    fun getActiveBodyparts(type: ActiveBodyPartConstant): Int
    fun harvest(target: Source): ScreepsReturnCode
    fun harvest(target: Mineral): ScreepsReturnCode
    fun heal(target: Creep): ScreepsReturnCode
    fun move(direction: DirectionConstant): ScreepsReturnCode
    fun moveByPath(path: Array<Room.PathStep>): ScreepsReturnCode
    fun moveByPath(serializedPath: String): ScreepsReturnCode
    fun moveTo(target: NavigationTarget, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun moveTo(x: Int, y: Int, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun notifyWhenAttacked(enable: Boolean): ScreepsReturnCode
    fun pickup(target: Resource): ScreepsReturnCode
    fun rangedAttack(target: Creep): ScreepsReturnCode
    fun rangedAttack(target: Structure): ScreepsReturnCode
    fun rangedHeal(target: Creep): ScreepsReturnCode
    fun rangedMassAttack(): ScreepsReturnCode
    fun repair(structure: Structure): ScreepsReturnCode
    fun reserveController(controller: StructureController): ScreepsReturnCode
    fun say(message: String, toPublic: Boolean = definedExternally): ScreepsReturnCode
    fun signController(controller: StructureController, text: String): ScreepsReturnCode
    fun suicide(): ScreepsReturnCode
    fun transfer(target: Structure, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun transfer(target: Creep, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun upgradeController(controller: StructureController): ScreepsReturnCode
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

    interface BodyPart {
        val boost: String?
        val type: BodyPartConstant
        val hits: Int
    }

}

external interface MoveToOptions : FindPathOptions {
    val reusePath: Int?
    val serializeMemory: Boolean?
    val noPathFinding: Boolean?
    val visualizePathStyle: RoomVisual.Style?
}