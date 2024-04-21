package screeps.api

import screeps.api.structures.Structure

external class RoomPosition(x: Int, y: Int, roomName: String) : NavigationTarget {
    val roomName: String
    val x: Int
    val y: Int

    fun createConstructionSite(structureType: BuildableStructureConstant): ScreepsReturnCode
    fun createConstructionSite(structureType: BuildableStructureConstant, name: String): ScreepsReturnCode
    fun createFlag(
        name: String = definedExternally,
        color: ColorConstant = definedExternally,
        secondaryColor: ColorConstant
    ): Any

    fun <T : RoomObject> findClosestByPath(
        objects: Array<T>,
        opts: FindClosestByPathOptions<T> = definedExternally
    ): T?

    fun <T> findClosestByPath(
        type: FindConstant<T>,
        opts: FindClosestByPathOptions<T> = definedExternally
    ): T?

    fun <T : RoomObject> findClosestByRange(
        objects: Array<T>,
        opts: FilterOption<T> = definedExternally
    ): T?

    fun <T> findClosestByRange(type: FindConstant<T>, opts: FilterOption<T> = definedExternally): T?

    fun <T : RoomObject> findInRange(
        type: FindConstant<T>,
        range: Int,
        opts: FilterOption<T> = definedExternally
    ): Array<T>

    fun <T : NavigationTarget> findInRange(
        objects: Array<T>,
        range: Int,
        opts: FilterOption<T> = definedExternally
    ): Array<T>

    fun findPathTo(x: Int, y: Int, opts: FindPathOptions = definedExternally): Array<Room.PathStep>
    fun findPathTo(target: NavigationTarget, opts: FindPathOptions = definedExternally): Array<Room.PathStep>

    fun getDirectionTo(x: Int, y: Int): DirectionConstant
    fun getDirectionTo(target: RoomPosition): DirectionConstant
    fun getDirectionTo(target: RoomObject): DirectionConstant
    fun getRangeTo(x: Int, y: Int): Int
    fun getRangeTo(target: RoomPosition): Int
    fun getRangeTo(target: RoomObject): Int
    fun inRangeTo(x: Int, y: Int, range: Int): Boolean
    fun inRangeTo(target: RoomPosition, range: Int): Boolean
    fun isEqualTo(x: Int, y: Int): Boolean
    fun isEqualTo(target: RoomPosition): Boolean
    fun isEqualTo(target: RoomObject): Boolean
    fun isNearTo(x: Int, y: Int): Boolean
    fun isNearTo(target: RoomPosition): Boolean
    fun isNearTo(target: RoomObject): Boolean
    fun look(): Array<Look>
    fun <T> lookFor(type: LookConstant<T>): Array<T>?

    interface Look {
        val type: LookConstant<Any>
        val creep: Creep?
        val structure: Structure?
        val terrain: TerrainConstant?
        val constructionSite: ConstructionSite?
        val resource: Resource?
    }
}

external interface FindClosestByPathOptions<T> : FindPathOptions, FilterOption<T> {
    var algorithm: AlgorithmConstant?
}
