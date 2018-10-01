@file:JsModule("react-native")

package react.native.components.activityindicator

import react.Component
import react.RProps
import react.RState

external interface ActivityIndicatorPropsBase : RProps {
    var animating: Boolean?
    var hidesWhenStopped: Boolean?
}

external interface ActivityIndicatorProps : ActivityIndicatorPropsBase {
    var color: String?
    var size: String?
}

external class ActivityIndicator : Component<ActivityIndicatorProps, RState> {
    override fun render(): dynamic
}