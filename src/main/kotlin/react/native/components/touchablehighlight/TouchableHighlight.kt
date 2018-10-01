@file:JsModule("react-native")

package react.native.components.touchablehighlight

import react.Component
import react.RProps
import react.RState
import react.native.components.touchablewithoutfeedback.TouchableWithoutFeedbackProps

external interface TouchableHighlightPropsBase : RProps {
    var activeOpacity: Number?
    var onHideUnderlay: (() -> Unit)?
    var onShowUnderlay: (() -> Unit)?
    var hasTVPreferredFocus: Boolean?
    var tvParallaxProperties: dynamic
}

external interface TouchableHighlightProps : TouchableHighlightPropsBase, TouchableWithoutFeedbackProps {
    var underlayColor: String?
}

external class TouchableHighlight : Component<TouchableHighlightProps, RState> {
    override fun render(): dynamic
}