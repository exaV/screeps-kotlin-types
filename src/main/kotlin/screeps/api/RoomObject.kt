package screeps.api

external interface RoomObject : HasPosition {
    val room: Room
    val effects: List<RoomEffect>

    interface RoomEffect {
        val power: PowerEffectConstant
        val level: Int
        val ticksRemaining: Int
    }
}