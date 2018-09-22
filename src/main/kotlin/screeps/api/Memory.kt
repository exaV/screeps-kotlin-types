package screeps.api

external object Memory : MutableRecord<String, dynamic> {
    var creeps: MutableRecord<String, CreepMemory>
    var flags: MutableRecord<String, FlagMemory>?
    var rooms: MutableRecord<String, RoomMemory>
    var spawns: MutableRecord<String, SpawnMemory>?

}

external interface CreepMemory
external interface FlagMemory
external interface RoomMemory
external interface SpawnMemory
