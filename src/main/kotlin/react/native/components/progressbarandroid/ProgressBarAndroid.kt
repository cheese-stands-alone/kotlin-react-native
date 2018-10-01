@file:JsModule("react-native")

package react.native.components.progressbarandroid

import react.Component
import react.RProps
import react.RState
import react.native.components.view.ViewProps

external interface ProgressBarAndroidPropsBase : RProps {
    var animating: Boolean?
    var indeterminate: Boolean?
    var progress: Number?
}

external interface ProgressBarAndroidProps : ProgressBarAndroidPropsBase, ViewProps {
    var color: String?
    var styleAttr: String?
}

external class ProgressBarAndroid : Component<ProgressBarAndroidProps, RState> {
    override fun render(): dynamic
}