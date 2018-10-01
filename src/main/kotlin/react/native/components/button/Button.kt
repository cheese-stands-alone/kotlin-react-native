@file:JsModule("react-native")

package react.native.components.button

import react.Component
import react.RProps
import react.RState

external interface ButtonPropsBase : RProps {
    var onPress: (() -> Unit)?
    var title: String?
    var accessibilityLabel: String?
    var disabled: Boolean?
    var testID: String?
    var hasTVPreferredFocus: Boolean?
}


external interface ButtonProps : ButtonPropsBase {
    var color: String?
}

external class Button : Component<ButtonProps, RState> {
    override fun render(): dynamic
}