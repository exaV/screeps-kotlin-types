package screeps.utils


sealed class Result<out E, out V> {
    open val error: E? = null
    open val value: V? = null

    class Error<out E>(override val error: E) : Result<E, Nothing>()
    class Value<out V>(override val value: V) : Result<Nothing, V>()
}