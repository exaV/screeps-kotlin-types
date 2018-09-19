package screeps.api

import kotlin.js.Json

//TODO test and improve GameMap
external class GameMap {
    fun describeExits(roomName: String): Json
    fun findExit(fromRoom: Room, toRoom: Room, opts: FindPathOpts = definedExternally): Number
    fun findRoute(fromRoom: Room, toRoom: Room, opts: FindRouteOptions = definedExternally): Any //String or Route
    fun getRoomLinearDistance(roomName1: String, roomName2: String, continuous: Boolean = definedExternally): Int
    fun getTerrainAt(x: Int, y: Int, roomName: String): String
    fun getTerrainAt(pos: RoomPosition): String
    fun getWorldSize(): Int
    fun isRoomAvailable(roomName: String): Boolean
}

class FindRouteOptions(val routeCallback: (roomName: String, fromRoomName: String) -> Double)
