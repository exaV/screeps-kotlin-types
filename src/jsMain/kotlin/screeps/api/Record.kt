package screeps.api

external interface JsPair<out F, out S>
external interface Record<in K, out V>
external interface MutableRecord<in K, V> : Record<K, V>

inline operator fun <F, S> JsPair<F, S>.component1(): F = asDynamic()[0].unsafeCast<F>()
inline operator fun <F, S> JsPair<F, S>.component2(): S = asDynamic()[1].unsafeCast<S>()

inline operator fun <K, V> Record<K, V>.get(key: K): V? = asDynamic()[key].unsafeCast<V?>()
inline operator fun <K, V> MutableRecord<K, V>.set(key: K, value: V) {
    this.asDynamic()[key] = value
}

inline val <K, V>Record<K, V>.entries: Array<JsPair<String, V>> get() = js("Object").entries(this).unsafeCast<Array<JsPair<String, V>>>()
inline val <K, V>Record<K, V>.values: Array<V> get () = js("Object").values(this).unsafeCast<Array<V>>()
inline val <K, V>Record<K, V>.keys: Array<String> get () = js("Object").keys(this).unsafeCast<Array<String>>()
inline val <K, V>Record<K, V>.size: Int get() = keys.size

inline operator fun <K, V> Record<K, V>.iterator(): Iterator<JsPair<String, V>> = entries.iterator()
