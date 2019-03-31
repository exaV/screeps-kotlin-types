package screeps.api.structures

import screeps.api.*


abstract external class Structure : RoomObjectNotNull, Attackable, Identifiable {
    val structureType: StructureConstant

    fun destroy(): ScreepsReturnCode
    fun isActive(): Boolean
    fun notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode
}
