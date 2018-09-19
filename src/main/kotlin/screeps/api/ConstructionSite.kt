package screeps.api

import screeps.api.structures.Owner

external class ConstructionSite : RoomObject {
    val my: Boolean
    val owner: Owner
    val progress: Int
    val progressTotal: Int
    val structureType: BuildableStructureConstant
    fun remove(): ScreepsReturnCode
}