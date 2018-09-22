package screeps.api.structures

import screeps.api.Creep
import screeps.api.EnergyContainer
import screeps.api.Owned
import screeps.api.ScreepsReturnCode

abstract external class StructureLab : Structure, Owned, EnergyContainer {
    val cooldown: Int
    val mineralAmount: Int
    val mineralType: String
    val mineralCapacity: Int
    fun boostCreep(creep: Creep, bodyPartsCount: Int = definedExternally): ScreepsReturnCode
    fun runReaction(lab1: StructureLab, lab2: StructureLab): ScreepsReturnCode
    fun unboostCreep(creep: Creep): ScreepsReturnCode
}