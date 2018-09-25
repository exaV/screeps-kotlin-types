package screeps.api

external object Memory : MutableRecord<String, dynamic> {
    var creeps: MutableRecord<String, CreepMemory>
    var flags: MutableRecord<String, FlagMemory>?
    var rooms: MutableRecord<String, RoomMemory>
    var spawns: MutableRecord<String, SpawnMemory>?

}

/**
 * Indicates that this type is always a child of the global _Memory_ object
 */
external interface MemoryMarker

external interface CreepMemory : MemoryMarker
external interface FlagMemory : MemoryMarker
external interface RoomMemory : MemoryMarker
external interface SpawnMemory : MemoryMarker
