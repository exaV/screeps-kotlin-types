package screeps.api

fun <T : RoomEventData, R> RoomEvent<*>.handle(
    eventType: EventConstant<T>,
    handler: (RoomEvent<T>) -> R,
): R? {
    if (this.event != eventType) return null
    return handler.invoke(this.unsafeCast<RoomEvent<T>>())
}

external interface RoomEvent<T : RoomEventData> {
    val event: EventConstant<T>
    val objectId: String
    val data: T
}

external interface RoomEventData

external interface AttackEvent : RoomEventData {
    val targetId: String
    val damage: Int
    val attackType: EventAttackTypeConstant
}

external interface DestroyedEvent : RoomEventData {
    val type: String
}

external interface AttackControllerEvent : RoomEventData

external interface BuildEvent : RoomEventData {
    val targetId: String
    val amount: Int
    val structureType: BuildableStructureConstant
    val x: Int
    val y: Int
    val incomplete: Any
}

external interface HarvestEvent : RoomEventData {
    val targetId: String
    val amount: Int
}

external interface HealEvent : RoomEventData {
    val targetId: String
    val amount: Int
    val healType: EventHealTypeConstant
}

external interface RepairEvent : RoomEventData {
    val targetId: String
    val amount: Int
    val energySpent: Int
}

external interface ReserveControllerEvent : RoomEventData {
    val amount: Int
}

external interface UpgradeControllerEvent : RoomEventData {
    val amount: Int
    val energySpent: Int
}

external interface ExitEvent : RoomEventData {
    val room: String
    val x: Int
    val y: Int
}

external interface TransferEvent : RoomEventData {
    val targetId: String
    val resourceType: ResourceConstant
    val amount: Int
}

external interface PowerEvent : RoomEventData {
    val targetId: String
    val power: PowerEffectConstant
}
