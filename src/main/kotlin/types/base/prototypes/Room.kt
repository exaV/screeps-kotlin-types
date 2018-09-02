package types.base.prototypes

import types.base.global.*
import types.base.prototypes.structures.Structure
import types.base.prototypes.structures.StructureController
import types.base.prototypes.structures.StructureStorage
import types.base.prototypes.structures.StructureTerminal

external class Room {
    val controller: StructureController?
    val energyAvailable: Int
    val energyCapacityAvailable: Int
    val memory: dynamic
    val name: String
    val storage: StructureStorage?
    val terminal: StructureTerminal?
    val visual: RoomVisual

    fun createConstructionSite(x: Int, y: Int, structureType: StructureConstant): ScreepsReturnCode
    fun createConstructionSite(pos: RoomPosition, structureType: StructureConstant): ScreepsReturnCode
    fun createFlag(
        x: Int,
        y: Int,
        name: String = definedExternally,
        color: ColorConstant = definedExternally,
        secondaryColor: ColorConstant = definedExternally
    ): Any

    fun createFlag(
        pos: RoomPosition,
        name: String = definedExternally,
        color: ColorConstant = definedExternally,
        secondaryColor: ColorConstant = definedExternally
    ): Any

    fun <T : RoomObject> find(FIND_CONSTANT: FindConstant): Array<T>
    fun findExitTo(room: String): Any
    fun findExitTo(room: Room): Any
    fun findPath(fromPos: RoomPosition, toPos: RoomPosition, opts: FindPathOpts? = definedExternally): Array<PathStep>
    fun getPositionAt(x: Number, y: Number): RoomPosition?
    fun lookAt(x: Number, y: Number): Array<LookAt>
    fun lookAt(target: RoomPosition): Array<LookAt>
    fun lookAtArea(
        top: Number,
        left: Number,
        bottom: Number,
        right: Number,
        asArray: Boolean? = definedExternally /* null */
    ): dynamic /* LookAtResultMatrix<dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ */> | Array<Any? /* Any? & `T$79` & `T$95` */> */

    fun <T> lookForAt(type: LookConstant, x: Number, y: Number): Array<T>?


}

external class LookAt {
    val type: LookConstant
    val creep: Creep?
    val structure: Structure?
    val terrain: String?
    val constructionSite: ConstructionSite?
    val resource: Resource?
}

fun Room.findCreeps() = find<Creep>(FIND_CREEPS)
fun Room.findEnergy() = find<Source>(FIND_SOURCES)
fun Room.findConstructionSites() = find<ConstructionSite>(FIND_CONSTRUCTION_SITES)
fun Room.findStructures() = find<Structure>(FIND_STRUCTURES)
fun Room.findDroppedEnergy() = find<Resource>(FIND_DROPPED_RESOURCES).filter { it.resourceType == RESOURCE_ENERGY }

class FindPathOpts(
    val ignoreCreeps: Boolean = false,
    val ignoreDestructibleStructures: Boolean = false,
    val ignoreRoads: Boolean = false,
    val maxOps: Int = 2000,
    val heuristicWeight: Double = 1.2,
    val serialize: Boolean = false,
    val maxRooms: Int = 16,
    val range: Int = 0
)

external interface PathStep {
    var x: Int
    var dx: Int
    var y: Int
    var dy: Int
    var direction: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ */
}