package screeps.api

/**
 * Indicates that this type is always a child of the global _Memory_ object
 */
external interface MemoryMarker

/**
 * A global plain object which can contain arbitrary data. You can access it both using the API and the Memory UI in the game editor.
 *
 * All extension properties on Memory should inherith the interface MemoryMarker
 * @see MemoryMarker
 */
external object Memory : GlobalMemory {
    var creeps: MutableRecord<String, CreepMemory>
    var powerCreeps: MutableRecord<String, PowerCreepMemory>
    var flags: MutableRecord<String, FlagMemory>?
    var rooms: MutableRecord<String, RoomMemory>
    var spawns: MutableRecord<String, SpawnMemory>?
}
external interface GlobalMemory : MutableRecord<String, dynamic>, MemoryMarker
external interface CreepMemory : MemoryMarker
external interface PowerCreepMemory : MemoryMarker
external interface FlagMemory : MemoryMarker
external interface RoomMemory : MemoryMarker
external interface SpawnMemory : MemoryMarker
