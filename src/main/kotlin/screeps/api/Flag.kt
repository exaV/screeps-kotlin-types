package screeps.api

abstract external class Flag : RoomObjectNullable {
    val color: ColorConstant
    val memory: FlagMemory
    val name: String
    val secondaryColor: ColorConstant
    fun remove() // always ok
    fun setColor(color: ColorConstant, secondaryColor: ColorConstant = definedExternally): ScreepsReturnCode
    fun setPosition(x: Int, y: Int): ScreepsReturnCode
    fun setPosition(pos: RoomPosition): ScreepsReturnCode
    fun setPosition(pos: HasPosition): ScreepsReturnCode
}