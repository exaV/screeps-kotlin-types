package screeps.api

// The InterShardMemory is simply not defined on private servers
// Check if global.InterShardMemory is not null before using these

external interface InterShardMemory {
    fun getLocal(): String?
    fun setLocal(value: String)
    fun getRemote(shard: String): String?
}