@file:JsModule("react-native")

package react.native.components.safeareaview

import react.Component
import react.RState
import react.native.components.view.ViewProps

external interface SafeAreaViewProps : ViewProps

external class SafeAreaView : Component<SafeAreaViewProps, RState> {
    override fun render(): dynamic
}