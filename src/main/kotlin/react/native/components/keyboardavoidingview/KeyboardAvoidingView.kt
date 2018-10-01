@file:JsModule("react-native")

package react.native.components.keyboardavoidingview

import react.Component
import react.RProps
import react.RState
import react.native.api.Style
import react.native.components.view.ViewProps

external interface KeyboardAvoidingViewPropsBase : RProps {
    var keyboardVerticalOffset: Number?
    var contentContainerStyle: Style?
    var enabled: Boolean?
}

external interface KeyboardAvoidingViewProps : KeyboardAvoidingViewPropsBase, ViewProps {
    var behavior: String?
}

external class KeyboardAvoidingView : Component<KeyboardAvoidingViewProps, RState> {
    override fun render(): dynamic
}