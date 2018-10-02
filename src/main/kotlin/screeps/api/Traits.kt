package screeps.api

external interface Identifiable {
    val id: String
}

external interface Harvestable {
    val ticksToRegeneration: Int
}

external interface Decaying {
    val ticksToDecay: Int
}

external interface Owned {
    val my: Boolean
    val owner: Owner

    interface Owner {
        val username: String
    }
}

external interface Attackable {
    val hits: Int
    val hitsMax: Int
}

external interface NavigationTarget
external interface HasPosition : NavigationTarget {
    val pos: RoomPosition
}

external interface EnergyContainer {
    val energy: Int
    val energyCapacity: Int
}
