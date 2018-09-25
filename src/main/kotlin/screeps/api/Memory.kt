package screeps.api

import screeps.utils.memory.MemoryMarker

external object Memory : MutableRecord<String, dynamic> {
    var creeps: MutableRecord<String, CreepMemory>
    var flags: MutableRecord<String, FlagMemory>?
    var rooms: MutableRecord<String, RoomMemory>
    var spawns: MutableRecord<String, SpawnMemory>?

}

external interface CreepMemory : MemoryMarker
external interface FlagMemory : MemoryMarker
external interface RoomMemory : MemoryMarker
external interface SpawnMemory : MemoryMarker
