package types.base.prototypes

import types.base.Filter
import types.base.global.*

external class RoomPosition(x: Int, y: Int, roomName: String) {
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
        type: FindConstant,
        objects: Array<RoomObject>,
        opts: dynamic = definedExternally
    ): T?

    fun <T : RoomObject> findClosestByPath(type: FindConstant, opts: dynamic = definedExternally): T?

    fun <T : RoomObject> findClosestByRange(
        type: FindConstant,
        objects: Array<RoomObject>,
        opts: dynamic = definedExternally
    ): T?

    fun <T : RoomObject> findClosestByRange(type: FindConstant, opts: dynamic = definedExternally): T?

    fun <T : RoomObject> findInRange(type: FindConstant, range: Int, opts: Filter = definedExternally): Array<T>
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
    fun look(): Array<LookAt>
    fun <T> lookFor(type: LookConstant): Array<T>?

}