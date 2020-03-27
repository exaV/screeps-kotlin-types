package screeps.api

import screeps.api.structures.StructureController

abstract external class Creep : GenericCreep {
    val body: Array<BodyPart>
    val fatigue: Int
    override val memory: CreepMemory
    val spawning: Boolean
    override val ticksToLive: Int

    fun attack(target: Attackable): ScreepsReturnCode
    fun attackController(target: StructureController): ScreepsReturnCode
    fun build(target: ConstructionSite): ScreepsReturnCode
    fun cancelOrder(methodName: String): ScreepsReturnCode
    fun claimController(controller: StructureController): ScreepsReturnCode
    fun dismantle(target: IStructure): ScreepsReturnCode
    fun generateSafeMode(target: StructureController): ScreepsReturnCode
    fun getActiveBodyparts(type: ActiveBodyPartConstant): Int
    fun harvest(target: Source): ScreepsReturnCode
    fun harvest(target: Mineral): ScreepsReturnCode
    fun heal(target: GenericCreep): ScreepsReturnCode
    fun rangedAttack(target: Attackable): ScreepsReturnCode
    fun rangedHeal(target: GenericCreep): ScreepsReturnCode
    fun rangedMassAttack(): ScreepsReturnCode
    fun repair(structure: IStructure): ScreepsReturnCode
    fun reserveController(controller: StructureController): ScreepsReturnCode
    fun signController(controller: StructureController, text: String): ScreepsReturnCode
    fun upgradeController(controller: StructureController): ScreepsReturnCode

    interface BodyPart {
        val boost: String?
        val type: BodyPartConstant
        val hits: Int
    }

}

