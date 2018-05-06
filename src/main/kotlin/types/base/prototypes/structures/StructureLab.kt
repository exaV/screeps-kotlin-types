package types.base.prototypes.structures

import types.base.global.ScreepsReturnCode
import types.base.prototypes.Creep

abstract external class StructureLab : OwnedStructure, EnergyContainingStructure {
    val cooldown: Int
    val mineralAmount: Int
    val mineralType: String
    val mineralCapacity: Int
    fun boostCreep(creep: Creep, bodyPartsCount: Int = definedExternally): ScreepsReturnCode
    fun runReaction(lab1: StructureLab, lab2: StructureLab): ScreepsReturnCode
}