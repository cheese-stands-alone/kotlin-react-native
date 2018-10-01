@file:JsModule("react-native")

package react.native.components.progressviewIOS

import react.Component
import react.RProps
import react.RState
import react.native.components.image.ImageURISource
import react.native.components.view.ViewProps

external interface ProgressViewIOSPropsBase : RProps {
    var progress: Number?
    var progressImage: Array<ImageURISource>?
    var progressTintColor: String
    var trackImage: Array<ImageURISource>?
    var trackTintColor: String
}

external interface ProgressViewIOSProps : ProgressViewIOSPropsBase, ViewProps {
    var progressViewStyle: String?
}

external class ProgressViewIOS : Component<ProgressViewIOSProps, RState> {
    override fun render(): dynamic
}