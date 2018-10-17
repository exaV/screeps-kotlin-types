package screeps.utils

import screeps.api.*

// Creators

fun <K, V> recordOf(vararg pairs: Pair<K, V>): Record<K, V> = mutableRecordOf(*pairs)
fun <K, V> mutableRecordOf(vararg pairs: Pair<K, V>): MutableRecord<K, V> =
    jsObject {
        pairs.forEach { (k, v) ->
            set(k, v)
        }
    }

// Functions

inline operator fun <K, V> Record<K, V>.contains(key: K): Boolean = containsKey(key)
inline fun <K, V> Record<K, V>.containsKey(key: K): Boolean = keys.contains(key)
inline fun <K, V> Record<K, V>.containsValue(value: V): Boolean = values.contains(value)

inline fun <K, V> Record<K, V>.getOrDefault(key: K, defaultValue: V): V = get(key) ?: defaultValue
inline fun <K, V> Record<K, V>.getOrElse(key: K, defaultValue: () -> V): V = get(key) ?: defaultValue()
inline fun <K, V> Record<K, V>.isEmpty(): Boolean = keys.isEmpty()
inline fun <K, V> Record<K, V>.isNotEmpty(): Boolean = keys.isNotEmpty()

// Converters

inline fun <K, V> Record<K, V>.asIterable(): Iterable<JsPair<K, V>> = entries.asIterable()
inline fun <K, V> Record<K, V>.asSequence(): Sequence<JsPair<K, V>> = entries.asSequence()
inline fun <F, S> JsPair<F, S>.toPair(): Pair<F, S> = Pair(component1(), component2())
inline fun <K, V> Record<K, V>.toMap(): Map<K, V> = unsafeCast<MutableRecord<K, V>>().toMap()
fun <K, V> MutableRecord<K, V>.toMap(): MutableMap<K, V> = mutableMapOf<K, V>().also { map ->
    entries.forEach { (k, v) ->
        map[k] = v
    }
}