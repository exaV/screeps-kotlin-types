package types.base.prototypes.structures

import types.base.global.StructureConstant
import types.base.prototypes.RoomObject


open external class Structure : RoomObject {
    val hits: Double
    val hitsMax: Double
    val structureType: StructureConstant

    fun destroy(): Number
    fun isActive(): Boolean
    fun notifyWhenAttacked(enabled: Boolean): Number
}

open external class OwnedStructure : Structure {
    val my: Boolean
    val owner: Owner
}

external interface Owner {
    val username: String
}

external interface EnergyContainingStructure {
    val energy: Int
    val energyCapacity: Int
}

/**
 * Energy can be used for spawning of creeps.
 */
external interface EnergyStructure : EnergyContainingStructure

external interface DecayingStructure {
    val ticksToDecay: Int
}




