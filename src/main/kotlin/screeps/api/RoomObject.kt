package screeps.api

external interface RoomObjectNotNull : RoomObject {
    override val room: Room
}

external interface RoomObject : HasPosition {
    val room: Room?
    val effects: Array<RoomEffect>?

    interface RoomEffect {
        val power: PowerEffectConstant
        val level: Int
        val ticksRemaining: Int
    }
}