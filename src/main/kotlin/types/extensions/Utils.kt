@file:Suppress("UNCHECKED_CAST")

package types.extensions

import types.base.prototypes.RoomPosition
import kotlin.js.Json

fun <T> jsonToMap(json: Json): Map<String, T> {
    val map: MutableMap<String, T> = linkedMapOf()
    for (key in js("Object").keys(json)) {
        map[key] = json[key as String] as T
    }
    return map
}

class VisualizePath(val visualizePathStyle: Style = Style(stroke = "#ffaa00")) {
    constructor(stroke: String) : this(Style(stroke))
}

enum class LineStyle {
    SOLID,
    DASHED,
    DOTTED
}

class Style(val stroke: String = "#ffffff",
            val fill: String? = null,
            lineStyle: LineStyle = LineStyle.DASHED,
            val strokeWidth: Double = 0.1,
            val opacity: Double = 0.5) {
    val lineStyle: String? = if (lineStyle == LineStyle.SOLID) null else lineStyle.name.toLowerCase()
}

fun RoomPosition.copy(x: Int = this.x, y: Int = this.y, name: String = this.roomName) =
        RoomPosition(x, y, name)
