@file:Suppress("unused")

package screeps.api

external object RawMemory {
    val segments: MutableRecord<Int, String>
    val foreignSegment: ForeignSegment?
    val interShardSegment: String?

    fun get(): String
    fun set(value: String)
    fun setActiveSegments(ids: Array<Int>)
    fun setActiveForeignSegment(username: String, id: Int = definedExternally)
    fun setDefaultPublicSegment(id: Int?)
    fun setPublicSegments(ids: Array<Int>)

    interface ForeignSegment {
        val username: String
        val id: Int
        val data: String
    }
}
