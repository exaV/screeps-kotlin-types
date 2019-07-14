package screeps.api.structures

import screeps.api.*

abstract external class StructureLab : Structure, Owned, EnergyContainer {
    val cooldown: Int
    val mineralAmount: Int
    val mineralType: ResourceConstant
    val mineralCapacity: Int
    fun boostCreep(creep: Creep, bodyPartsCount: Int = definedExternally): ScreepsReturnCode
    fun runReaction(lab1: StructureLab, lab2: StructureLab): ScreepsReturnCode
    fun unboostCreep(creep: Creep): ScreepsReturnCode
}