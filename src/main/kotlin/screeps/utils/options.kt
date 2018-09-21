package screeps.utils

import screeps.api.Game
import screeps.utils.memory.jsObject

fun routeOptions(routeCallback: (roomName: String, fromRoomName: String) -> Double): Game.Map.RouteOptions =
    jsObject { this.routeCallback = routeCallback }
