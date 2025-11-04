package screeps.api

import screeps.api.RoomVisual.*

external interface MapVisual {
    fun line(start: RoomPosition, end: RoomPosition, style: LineStyle = definedExternally): MapVisual
    fun circle(pos: RoomPosition, style: CircleStyle = definedExternally): MapVisual
    fun rect(topLeftPosition: RoomPosition, width: Double, height: Double, style: ShapeStyle = definedExternally): MapVisual
    fun poly(points: Array<RoomPosition>, style: ShapeStyle = definedExternally): MapVisual
    fun text(text: String, position: RoomPosition, style: TextStyle = definedExternally): MapVisual
    fun clear(): MapVisual
    fun getSize(): Double
}
