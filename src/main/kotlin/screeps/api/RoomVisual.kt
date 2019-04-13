package screeps.api

external class RoomVisual(roomName: String) {
    val roomName: String

    fun line(x1: Int, y1: Int, x2: Int, y2: Int, style: LineStyle = definedExternally): RoomVisual
    fun line(start: RoomPosition, end: RoomPosition, style: LineStyle = definedExternally): RoomVisual
    fun line(x: Int, y: Int, style: LineStyle = definedExternally): RoomVisual
    fun line(pos: RoomPosition, style: LineStyle = definedExternally): RoomVisual
    fun circle(x: Int, y: Int, style: CircleStyle = definedExternally): RoomVisual
    fun circle(pos: RoomPosition, style: CircleStyle = definedExternally): RoomVisual
    fun rect(x: Int, y: Int, width: Int, height: Int, style: ShapeStyle = definedExternally): RoomVisual
    fun rect(topLeftPosition: RoomPosition, width: Int, height: Int, style: ShapeStyle = definedExternally): RoomVisual
    fun poly(points: Array<RoomPosition>, style: ShapeStyle = definedExternally): RoomVisual
    fun poly(points: Array<Array<Int>>, style: ShapeStyle = definedExternally): RoomVisual
    fun text(text: String, x: Int, y: Int, style: TextStyle = definedExternally): RoomVisual
    fun text(text: String, position: RoomPosition, style: TextStyle = definedExternally): RoomVisual
    fun clear(): RoomVisual
    fun getSize(): Int

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

    interface TextStyle {
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