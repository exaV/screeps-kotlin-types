package screeps.api.structures

import screeps.api.*

abstract external class StructureNuker : Structure, Owned, StoreOwner, WithCooldown {
    fun launchNuke(position: RoomPosition): ScreepsReturnCode
}
