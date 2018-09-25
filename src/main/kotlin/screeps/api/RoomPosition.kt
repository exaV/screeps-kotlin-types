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
        objects: Array<RoomObject>,
        opts: FindClosestByPathOptions<T> = definedExternally
    ): T?

    fun <T : RoomObject> findClosestByPath(
        type: FindConstant,
        opts: FindClosestByPathOptions<T> = definedExternally
    ): T?

    fun <T : RoomObject> findClosestByRange(
        type: FindConstant,
        objects: Array<RoomObject>,
        opts: FilterOption<T> = definedExternally
    ): T?

    fun <T : RoomObject> findClosestByRange(type: FindConstant, opts: FilterOption<T> = definedExternally): T?

    fun <T : RoomObject> findInRange(
        type: FindConstant,
        range: Int,
        opts: FilterOption<T> = definedExternally
    ): Array<T>

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
    fun <T> lookFor(type: LookConstant): Array<T>?

    interface Look {
        val type: LookConstant
        val creep: Creep?
        val structure: Structure?
        val terrain: String?
        val constructionSite: ConstructionSite?
        val resource: Resource?
    }
}

external interface FindClosestByPathOptions<T> : FindPathOptions, FilterOption<T> {
    var algorithm: AlgorithmConstant?
}
