package screeps.utils

import screeps.api.Game
import screeps.api.LineStyleConstant
import screeps.api.RoomVisual
import screeps.api.TextAlignConstant

fun routeOptions(routeCallback: (roomName: String, fromRoomName: String) -> Double): Game.Map.RouteOptions = jsObject {
    this.routeCallback = routeCallback
}

// RoomVisual style options
fun lineStyle(
    width: Double? = null,
    color: String? = null,
    opacity: Double? = null,
    lineStyle: LineStyleConstant? = null
): RoomVisual.LineStyle = jsObject {
    this.width = width
    this.color = color
    this.opacity = opacity
    this.lineStyle = lineStyle
}

fun shapeStyle(
    fill: String? = null,
    opacity: Double? = null,
    stroke: String? = null,
    strokeWidth: Double? = null,
    lineStyle: LineStyleConstant? = null
): RoomVisual.ShapeStyle = jsObject {
    this.fill = fill
    this.opacity = opacity
    this.stroke = stroke
    this.strokeWidth = strokeWidth
    this.lineStyle = lineStyle
}

fun circleStyle(
    radius: Double? = null,
    fill: String? = null,
    opacity: Double? = null,
    stroke: String? = null,
    strokeWidth: Double? = null,
    lineStyle: LineStyleConstant? = null
): RoomVisual.CircleStyle = jsObject {
    this.radius = radius
    this.fill = fill
    this.opacity = opacity
    this.stroke = stroke
    this.strokeWidth = strokeWidth
    this.lineStyle = lineStyle
}

fun textStyle(
    color: String? = null,
    font: String? = null,
    stroke: String? = null,
    strokeWidth: Double? = null,
    backgroundColor: String? = null,
    backgroundPadding: String? = null,
    align: TextAlignConstant? = null,
    opacity: Double? = null
): RoomVisual.TextStyle = jsObject {
    this.color = color
    this.font = font
    this.stroke = stroke
    this.strokeWidth = strokeWidth
    this.backgroundColor = backgroundColor
    this.backgroundPadding = backgroundPadding
    this.align = align
    this.opacity = opacity
}