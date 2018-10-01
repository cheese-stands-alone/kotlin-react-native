@file:JsModule("react-native")

package react.native.components.touchableopacity

import react.Component
import react.RProps
import react.RState
import react.native.components.touchablewithoutfeedback.TouchableWithoutFeedbackProps

external interface TouchableOpacityPropsBase : RProps {
    var activeOpacity: Number?
    var tvParallaxProperties: dynamic
}

external interface TouchableOpacityProps : TouchableOpacityPropsBase, TouchableWithoutFeedbackProps

external class TouchableOpacity : Component<TouchableOpacityProps, RState> {
    override fun render(): dynamic

    fun setOpacityTo(value: Number)
}