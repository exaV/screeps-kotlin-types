package types.base

import types.base.global.IntegerConstant
import types.base.global.StringConstant

typealias StringDict<V> = JsDict<String, V>

external interface JsDict<K : Any, V>

@Suppress("NOTHING_TO_INLINE")
internal inline operator fun <V> StringDict<V>.get(key: String): V? = asDynamic()[key] as? V

internal inline operator fun <V> StringDict<V>.get(key: StringConstant): V = asDynamic()[key] as V
internal inline operator fun <K : IntegerConstant, V> JsDict<K, V>.get(key: K): V = asDynamic()[key] as V


internal fun <V> StringDict<V>.valuesInternal(): List<V> {
    // this is not an actual kotlin array, but it does provide an iterator
    val values = unsafeValues()
    val size: Int = values.size
    val list = ArrayList<V>(size)
    for (v in values) {
        list.add(v)
    }
    return list
}

// these are not real arrays in the kotlin sense, but arraylike enough
internal fun <T> StringDict<T>.unsafeKeys(): Array<String> = js("Object").keys(this)

internal fun <T> StringDict<T>.unsafeValues(): Array<T> = js("Object").keys(this)
internal fun <T> StringDict<T>.unsafeEntries(): Array<T> = js("Object").keys(this)


internal fun <V> StringDict<V>.toMap(): Map<String, V> {
    val map: MutableMap<String, V> = HashMap(20)
    for (key in unsafeKeys()) {
        val value: V? = this[key]
        if (value != null) {
            map[key] = value
        } else {
            println("null value for key $key")
        }
    }
    return map
}

external interface MutableStringDict<V> : StringDict<V>

class Filter(val filter: dynamic)

external fun delete(p: dynamic): Boolean = definedExternally





