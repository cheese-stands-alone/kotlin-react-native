@file:JsModule("react-native")

package react.native.components.switch

import react.Component
import react.RProps
import react.RState
import react.native.components.view.ViewProps

external class TrackColorImpl {
    var `false`: String?
    var `true`: String?
}

external interface SwitchPropsBase : RProps {
    var disabled: Boolean?
    var onValueChange: ((Boolean) -> Unit)?
    var value: Boolean?
}

external interface SwitchProps : SwitchPropsBase, ViewProps {
    var trackColor: TrackColorImpl?
    var ios_backgroundColor: String?
    var thumbTintColor: String?
    var tintColor: String?
}

external class Switch : Component<SwitchProps, RState> {
    override fun render(): dynamic
}