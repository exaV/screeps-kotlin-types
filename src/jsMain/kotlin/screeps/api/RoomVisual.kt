package screeps.api

external class RoomVisual(roomName: String) {
    val roomName: String

    fun line(x1: Double, y1: Double, x2: Double, y2: Double, style: LineStyle = definedExternally): RoomVisual
    fun line(start: RoomPosition, end: RoomPosition, style: LineStyle = definedExternally): RoomVisual
    fun line(x: Double, y: Double, style: LineStyle = definedExternally): RoomVisual
    fun line(pos: RoomPosition, style: LineStyle = definedExternally): RoomVisual
    fun circle(x: Double, y: Double, style: CircleStyle = definedExternally): RoomVisual
    fun circle(pos: RoomPosition, style: CircleStyle = definedExternally): RoomVisual
    fun rect(x: Double, y: Double, width: Double, height: Double, style: ShapeStyle = definedExternally): RoomVisual
    fun rect(topLeftPosition: RoomPosition, width: Double, height: Double, style: ShapeStyle = definedExternally): RoomVisual
    fun poly(points: Array<RoomPosition>, style: ShapeStyle = definedExternally): RoomVisual
    fun poly(points: Array<Array<Double>>, style: ShapeStyle = definedExternally): RoomVisual
    fun text(text: String, x: Double, y: Double, style: TextStyle = definedExternally): RoomVisual
    fun text(text: String, position: RoomPosition, style: TextStyle = definedExternally): RoomVisual
    fun clear(): RoomVisual
    fun getSize(): Double

    interface Style : Options {
        var opacity: Double?
        var lineStyle: LineStyleConstant?
    }

    interface LineStyle : Style {
        var color: String?
        var width: Double?
    }

    interface ShapeStyle : Style {
        var fill: String?
        var stroke: String?
        var strokeWidth: Double?
    }

    interface CircleStyle : ShapeStyle {
        var radius: Double?
    }

    interface TextStyle : Options {
        var color: String?
        var font: String?
        var stroke: String?
        var strokeWidth: Double?
        var backgroundColor: String?
        var backgroundPadding: String?
        var align: TextAlignConstant?
        var opacity: Double?
    }
}