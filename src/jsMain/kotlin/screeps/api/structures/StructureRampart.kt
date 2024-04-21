package screeps.api.structures

import screeps.api.Decaying
import screeps.api.Owned
import screeps.api.ScreepsReturnCode

abstract external class StructureRampart : Structure, Owned, Decaying {
    val isPublic: Boolean
    fun setPublic(isPublic: Boolean): ScreepsReturnCode
}