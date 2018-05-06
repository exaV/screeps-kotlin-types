package types.base.prototypes

import types.base.global.BuildableStructureConstant
import types.base.global.ScreepsReturnCode
import types.base.prototypes.structures.Owner

external class ConstructionSite : RoomObject {
    val my: Boolean
    val owner: Owner
    val progress: Number
    val progressTotal: Number
    val structureType: BuildableStructureConstant
    fun remove(): ScreepsReturnCode
}