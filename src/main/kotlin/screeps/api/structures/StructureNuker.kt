package screeps.api.structures

import screeps.api.*

abstract external class StructureNuker : Structure, Owned, IStore, WithCooldown {
    fun launchNuke(position: RoomPosition): ScreepsReturnCode
}
