@file:Suppress("UNCHECKED_CAST", "unused")

package screeps.utils

import screeps.api.*
import kotlin.js.Json

fun <T> jsonToMap(json: Json): Map<String, T> {
    val map: MutableMap<String, T> = linkedMapOf()
    for (key in js("Object").keys(json)) {
        map[key] = json[key as String] as T
    }
    return map
}

fun RoomPosition.copy(x: Int = this.x, y: Int = this.y, name: String = this.roomName): RoomPosition =
    RoomPosition(x, y, name)

val TerrainMaskConstant.terrain: TerrainConstant
    get() = when (this) {
        TERRAIN_MASK_WALL -> TERRAIN_WALL
        TERRAIN_MASK_SWAMP -> TERRAIN_SWAMP
        else -> TERRAIN_PLAIN
    }
