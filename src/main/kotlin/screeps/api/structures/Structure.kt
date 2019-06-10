package screeps.api.structures

import screeps.api.IStructure
import screeps.api.ScreepsReturnCode
import screeps.api.StructureConstant


abstract external class Structure : IStructure {
    override val structureType: StructureConstant

    override fun destroy(): ScreepsReturnCode
    override fun isActive(): Boolean
    override fun notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode
}
