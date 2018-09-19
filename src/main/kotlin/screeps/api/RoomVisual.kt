package screeps.api

external class RoomVisual() {
    constructor(roomName: String)

    val roomName: String
    fun line(x1: Int, y1: Int, x2: Int, y2: Int, style: dynamic = definedExternally): RoomVisual
    fun line(start: RoomPosition, end: RoomPosition, style: dynamic = definedExternally): RoomVisual
    fun line(x: Int, y: Int, style: dynamic = definedExternally): RoomVisual
    fun line(center: RoomPosition, style: dynamic = definedExternally): RoomVisual
    fun rect(topLeft_X: Int, topLeft_Y: Int, width: Int, height: Int, style: dynamic = definedExternally): RoomVisual
    fun rect(topLeftPosition: RoomPosition, width: Int, height: Int, style: dynamic = definedExternally): RoomVisual
    fun poly(points: Array<RoomPosition>, style: dynamic = definedExternally): RoomVisual
    fun poly(points: Array<Array<Int>>, style: dynamic = definedExternally): RoomVisual
    fun text(text: String, x: Int, y: Int, style: dynamic = definedExternally): RoomVisual
    fun text(text: String, position: RoomPosition, style: dynamic = definedExternally): RoomVisual
    fun clear(): RoomVisual
    fun getSize(): Int

}