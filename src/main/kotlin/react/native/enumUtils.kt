package react.native

interface ValueEnum<T> {
    val value: T
}

interface StringEnum : ValueEnum<String>

interface IntEnum : ValueEnum<Int>

inline fun <reified T, P> fromValue(value: P?) where T : Enum<T>, T : ValueEnum<P> =
        if (value == null) null else enumValues<T>().firstOrNull { it.value == value }