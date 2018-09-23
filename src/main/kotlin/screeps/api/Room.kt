package screeps.api

import screeps.api.structures.StructureController
import screeps.api.structures.StructureStorage
import screeps.api.structures.StructureTerminal

abstract external class Room {
    val controller: StructureController?
    val energyAvailable: Int
    val energyCapacityAvailable: Int
    val memory: RoomMemory
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

    fun <T : RoomObject> find(findConstant: FindConstant, opts: FilterOption<T> = definedExternally): Array<T>
    fun findExitTo(room: String): Any

    fun findExitTo(room: Room): Any
    fun findPath(fromPos: RoomPosition, toPos: RoomPosition, opts: FindPathOptions = definedExternally): Array<PathStep>
    fun getPositionAt(x: Int, y: Int): RoomPosition?
    fun lookAt(x: Int, y: Int): Array<RoomPosition.Look>
    fun lookAt(target: RoomPosition): Array<RoomPosition.Look>
    fun <T> lookForAt(type: LookConstant, x: Int, y: Int): Array<T>?

    interface PathStep {
        var x: Int
        var dx: Int
        var y: Int
        var dy: Int
        var direction: DirectionConstant
    }

    interface LookAtAreaArrayItem : RoomPosition.Look {
        val x: Int
        val y: Int
    }
}

private typealias LookAtAreaResult = Record<Int, Record<Int, Array<RoomPosition.Look>>>

fun Room.lookAtArea(top: Int, left: Int, bottom: Int, right: Int): LookAtAreaResult =
    this.asDynamic().lookAtArea(top, left, bottom, right, false).unsafeCast<LookAtAreaResult>()

fun Room.lookAtAreaAsArray(top: Int, left: Int, bottom: Int, right: Int): Array<Room.LookAtAreaArrayItem> =
    this.asDynamic().lookAtArea(top, left, bottom, right, true).unsafeCast<Array<Room.LookAtAreaArrayItem>>()

external interface FindPathOptions {
    var ignoreCreeps: Boolean?
    var ignoreDestructibleStructures: Boolean?
    var ignoreRoads: Boolean?
    var costCallback: ((roomName: String, costMatrix: PathFinder.CostMatrix) -> PathFinder.CostMatrix)?
    var maxOps: Int?
    var heuristicWeight: Double?
    var serialize: Boolean?
    var maxRooms: Int?
    var range: Int?
}
