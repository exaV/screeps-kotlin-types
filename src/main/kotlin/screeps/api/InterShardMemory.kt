package screeps.api

// The InterShardMemory is simply not defined on private servers, so we need to work around it

class InterShardMemory {
    companion object {
        fun getLocal() : String?
                = eval("if(global.InterShardMemory) global.InterShardMemory.getLocal()")?.unsafeCast<String>()

        fun setLocal(value: String)
                = eval("if(global.InterShardMemory) global.InterShardMemory.setLocal($value)")

        fun getRemote(shard: String) : String?
                = eval("if(global.InterShardMemory) global.InterShardMemory.getRemote($shard)")?.unsafeCast<String>()

    }
}