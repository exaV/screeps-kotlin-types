package screeps.api

import screeps.utils.memory.jsObject

external interface JsPair<out F, out S>
external interface Record<in K, out V>
external interface MutableRecord<in K, V> : Record<K, V>

inline operator fun <F, S> JsPair<F, S>.component1(): F = asDynamic()[0].unsafeCast<F>()
inline operator fun <F, S> JsPair<F, S>.component2(): S = asDynamic()[1].unsafeCast<S>()
inline fun <F, S> JsPair<F, S>.toPair() = Pair(this.component1(), this.component2())

inline operator fun <K, V> Record<K, V>.get(key: K): V? = this.asDynamic()[key].unsafeCast<V?>()
inline fun <K, V> Record<K, V>.getOrElse(key: K, defaultValue: () -> V): V = get(key) ?: defaultValue()
inline operator fun <K, V> MutableRecord<K, V>.set(key: K, value: V) {
    this.asDynamic()[key] = value
}

inline val <K, V>Record<K, V>.values: Array<V> get () = js("Object").values(this).unsafeCast<Array<V>>()
inline val <K, V>Record<K, V>.keys: Array<K> get () = js("Object").keys(this).unsafeCast<Array<K>>()
inline val <K, V>Record<K, V>.entries: Array<JsPair<K, V>> get() = js("Object").entries(this).unsafeCast<Array<JsPair<K, V>>>()
inline val <K, V>Record<K, V>.size: Int get() = keys.size
inline fun <K, V> Record<K, V>.isEmpty() = keys.isEmpty()
inline fun <K, V> Record<K, V>.isNotEmpty() = keys.isNotEmpty()

inline operator fun <K, V> Record<K, V>.iterator(): Iterator<JsPair<K, V>> = this.entries.iterator()
inline fun <K, V> Record<K, V>.asIterable(): Iterable<JsPair<K, V>> = this.entries.asIterable()

inline operator fun <K, V> Record<K, V>.contains(value: K): Boolean = this.keys.contains(value)

fun <K, V> Record<K, V>.toMap(): Map<K, V> = this.unsafeCast<MutableRecord<K, V>>().toMap()
fun <K, V> MutableRecord<K, V>.toMap(): MutableMap<K, V> = mutableMapOf<K, V>().also { map ->
    this.entries.forEach { (k, v) ->
        map[k] = v
    }
}

@Suppress("unused")
fun <K, V> recordOf(vararg pairs: Pair<K, V>): Record<K, V> = mutableRecordOf(*pairs)

fun <K, V> mutableRecordOf(vararg pairs: Pair<K, V>): MutableRecord<K, V> =
    jsObject {
        pairs.forEach { (k, v) ->
            this[k] = v
        }
    }

class Filter(val filter: dynamic)

external fun delete(p: dynamic): Boolean = definedExternally

sealed class Result<out E, out V> {
    open val error: E? = null
    open val value: V? = null

    class Error<out E>(override val error: E) : Result<E, Nothing>()
    class Value<out V>(override val value: V) : Result<Nothing, V>()
}
