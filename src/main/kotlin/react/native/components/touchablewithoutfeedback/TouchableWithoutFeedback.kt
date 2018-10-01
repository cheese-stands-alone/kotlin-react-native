@file:JsModule("react-native")

package react.native.components.touchablewithoutfeedback

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.api.Style
import react.native.components.view.HitSlop
import react.native.components.view.NativeEvent
import react.native.components.view.NativeTouchEvent
import react.native.components.view.ViewProps

external interface TouchableWithoutFeedbackPropsBase : RProps {
    var delayLongPress: Number?
    var delayPressIn: Number?
    var delayPressOut: Number
    var disabled: Boolean?
    var onLongPress: ((NativeEvent<NativeTouchEvent>)->Unit)?
    var onPress: ((NativeEvent<NativeTouchEvent>)->Unit)?
    var onPressIn: ((NativeEvent<NativeTouchEvent>)->Unit)?
    var onPressOut: ((NativeEvent<NativeTouchEvent>)->Unit)?
    var pressRetentionOffset: HitSlop?
}

external interface TouchableWithoutFeedbackProps : TouchableWithoutFeedbackPropsBase, ViewProps {

}

external class TouchableWithoutFeedback : Component<TouchableWithoutFeedbackProps, RState> {
    override fun render(): dynamic
}