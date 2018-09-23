package screeps.utils

import screeps.api.CreepMemory
import screeps.api.DirectionConstant
import screeps.api.Game
import screeps.api.SpawnEnergyProvider
import screeps.api.structures.StructureSpawn

fun routeOptions(routeCallback: (roomName: String, fromRoomName: String) -> Double): Game.Map.RouteOptions = jsObject {
    this.routeCallback = routeCallback
}

fun spawnOwptions(
    memory: CreepMemory? = null,
    energyStructures: Array<SpawnEnergyProvider>? = null,
    dryRun: Boolean? = null,
    directions: Array<DirectionConstant>? = null
): StructureSpawn.SpawnOptions = jsObject {
    this.memory = memory
    this.energyStructures = energyStructures
    this.dryRun = dryRun
    this.directions = directions
}