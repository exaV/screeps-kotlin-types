package screeps.api

external interface InterShardMemory {
    fun getLocal(): String?
    fun setLocal(value: String)
    fun getRemote(shard: String): String?
}
