package react.native.api

enum class OS {
    IOS,
    ANDROID
}

enum class KeyboardCallbackType {
    keyboardWillShow,
    keyboardDidShow,
    keyboardWillHide,
    keyboardDidHide,
    keyboardWillChangeFrame,
    keyboardDidChangeFrame,
}

val Platform.type: OS
    get() = react.native.api.OS.valueOf(asDynamic().OS.toString().toUpperCase())

fun Keyboard.addListener(listener: Pair<KeyboardCallbackType, () -> Unit>) = addListener(listener.first.name, listener.second)

fun Keyboard.removeListener(listener: Pair<KeyboardCallbackType, () -> Unit>) = removeListener(listener.first.name, listener.second)

enum class ConnectionType {
    none,
    wifi,
    cellular,
    unknown,
    bluetooth,
    ethernet,
    wimax
}

enum class EffectiveConnectionType {
    TWO_G,
    THREE_G,
    FOUR_G,
    UNKNOWN
}

class NetworkInfoEnum(val info: NetworkInfo) {
    val type = ConnectionType.valueOf(info.type)
    val effectiveType = when (info.effectiveType) {
        "2g" -> EffectiveConnectionType.TWO_G
        "3g" -> EffectiveConnectionType.THREE_G
        "4g" -> EffectiveConnectionType.FOUR_G
        else -> EffectiveConnectionType.UNKNOWN
    }
}

fun NetInfo.addEventListener(callback: (NetworkInfoEnum) -> Unit): (NetworkInfo) -> Unit {
    val block: (NetworkInfo) -> Unit = { callback(NetworkInfoEnum(it)) }
    addEventListener("connectionChange", block)
    return block
}

fun NetInfo.removeEventListener(callback: (NetworkInfo) -> Unit) = removeEventListener("connectionChange", callback)

fun NetInfo.getConnectionInfoEnum() = getConnectionInfo().then { NetworkInfoEnum(it) }
