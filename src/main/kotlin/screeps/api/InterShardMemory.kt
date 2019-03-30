package screeps.api

external object InterShardMemory {
    fun getLocal() : String
    fun setLocal(value: String)
    fun getRemote(shard: String) : String
}