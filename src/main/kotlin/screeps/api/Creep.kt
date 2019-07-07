package screeps.api

import screeps.api.structures.Structure
import screeps.api.structures.StructureController

abstract external class Creep : GenericCreep {
    val body: Array<BodyPart>
    val fatigue: Int
    override val memory: CreepMemory
    val spawning: Boolean
    override val ticksToLive: Int

    fun attack(target: Creep): ScreepsReturnCode
    fun attack(target: Structure): ScreepsReturnCode
    fun attackController(target: StructureController): ScreepsReturnCode
    fun build(target: ConstructionSite): ScreepsReturnCode
    fun cancelOrder(methodName: String): ScreepsReturnCode
    fun claimController(controller: StructureController): ScreepsReturnCode
    fun dismantle(target: Structure): ScreepsReturnCode
    fun generateSafeMode(target: StructureController): ScreepsReturnCode
    fun getActiveBodyparts(type: ActiveBodyPartConstant): Int
    fun harvest(target: Source): ScreepsReturnCode
    fun harvest(target: Mineral): ScreepsReturnCode
    fun heal(target: Creep): ScreepsReturnCode
    fun rangedAttack(target: Creep): ScreepsReturnCode
    fun rangedAttack(target: Structure): ScreepsReturnCode
    fun rangedHeal(target: Creep): ScreepsReturnCode
    fun rangedMassAttack(): ScreepsReturnCode
    fun repair(structure: Structure): ScreepsReturnCode
    fun reserveController(controller: StructureController): ScreepsReturnCode
    fun signController(controller: StructureController, text: String): ScreepsReturnCode
    fun upgradeController(controller: StructureController): ScreepsReturnCode

    interface BodyPart {
        val boost: String?
        val type: BodyPartConstant
        val hits: Int
    }

}

