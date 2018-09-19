package screeps.api

external class Flag : RoomObject {
    val color: ColorConstant
    val memory: FlagMemory
    val name: String
    val secondaryColor: ColorConstant
    fun remove() // always ok
    fun setColor(color: ColorConstant): ScreepsReturnCode
    fun setColor(color: ColorConstant, secondaryColor: ColorConstant): ScreepsReturnCode
    fun setPosition(position: RoomPosition): ScreepsReturnCode
    fun setPosition(x: Int, y: Int): ScreepsReturnCode
    fun setPosition(roomObject: RoomObject): ScreepsReturnCode
}