@file:JsModule("react-native")

package react.native.api.alert

external interface AlertButton {
    var text: String?
    var onPress: (() -> Unit)?
    var style: String?
}

external interface AlertOptions {
    var cancelable: Boolean?
    var onDismiss: (() -> Unit)?
}

external object Alert {
    fun alert(
            title: String,
            message: String? = definedExternally,
            buttons: Array<AlertButton>? = definedExternally,
            options: AlertOptions? = definedExternally,
            type: String? = definedExternally
    )
}