@file:JsModule("react-native")

package react.native.components.touchablenativefeedback

import react.Component
import react.RProps
import react.RState
import react.native.components.touchablewithoutfeedback.TouchableWithoutFeedbackProps

external interface BaseBackgroundPropType {
    var type: String?
}

external interface ThemeAttributeBackgroundPropType : BaseBackgroundPropType {
    var attribute: String?
}

external interface RippleBackgroundPropType : BaseBackgroundPropType {
    var color: Number?
    var borderless: Boolean?
}

external interface TouchableNativeFeedbackPropsBase : RProps {
    var background: BaseBackgroundPropType
    var useForeground: Boolean?
}

external interface TouchableNativeFeedbackProps : TouchableNativeFeedbackPropsBase, TouchableWithoutFeedbackProps

external class TouchableNativeFeedback : Component<TouchableNativeFeedbackProps, RState> {
    override fun render(): dynamic

    companion object {
        fun SelectableBackground(): ThemeAttributeBackgroundPropType
        fun SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType
        fun Ripple(color: String, borderless: Boolean? = definedExternally): RippleBackgroundPropType
        fun canUseNativeForeground(): Boolean
    }
}