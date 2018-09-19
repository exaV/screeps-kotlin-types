package screeps.api.structures

import screeps.api.Attackable
import screeps.api.Identifiable
import screeps.api.RoomObject
import screeps.api.ScreepsReturnCode
import screeps.api.StructureConstant


abstract external class Structure : RoomObject, Attackable, Identifiable {
    val structureType: StructureConstant

    fun destroy(): ScreepsReturnCode
    fun isActive(): Boolean
    fun notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode
}
