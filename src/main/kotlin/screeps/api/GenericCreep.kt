package screeps.api

external interface GenericCreep : RoomObjectNotNull, Owned, Attackable, Identifiable, StoreOwner {
    val memory: MemoryMarker
    val name: String
    val saying: String
    val ticksToLive: Int?

    fun drop(resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun move(direction: DirectionConstant): ScreepsReturnCode
    fun moveByPath(path: Array<Room.PathStep>): ScreepsReturnCode
    fun moveByPath(serializedPath: String): ScreepsReturnCode
    fun moveByPath(path: Array<RoomPosition>): ScreepsReturnCode
    fun moveTo(target: NavigationTarget, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun moveTo(x: Int, y: Int, opts: MoveToOptions = definedExternally): ScreepsReturnCode
    fun notifyWhenAttacked(enable: Boolean): ScreepsReturnCode
    fun pickup(target: Resource): ScreepsReturnCode
    fun say(message: String, toPublic: Boolean = definedExternally): ScreepsReturnCode
    fun suicide(): ScreepsReturnCode
    fun transfer(target: StoreOwner, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode
    fun withdraw(target: StoreOwner, resourceType: ResourceConstant, amount: Int = definedExternally): ScreepsReturnCode

}

external interface MoveToOptions : FindPathOptions {
    var reusePath: Int? get() = definedExternally; set(value) = definedExternally
    var serializeMemory: Boolean? get() = definedExternally; set(value) = definedExternally
    var noPathFinding: Boolean? get() = definedExternally; set(value) = definedExternally
    var visualizePathStyle: RoomVisual.Style? get() = definedExternally; set(value) = definedExternally
}