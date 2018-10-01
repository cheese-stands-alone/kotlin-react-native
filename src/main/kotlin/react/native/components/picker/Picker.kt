@file:JsModule("react-native")

package react.native.components.picker

import react.Component
import react.RProps
import react.RState
import react.native.api.Style
import react.native.components.view.ViewProps

external interface PickerPropsBase : RProps {
    var onValueChange: ((dynamic, Number) -> Unit)?
    var selectedValue: dynamic
    var enabled: Boolean?
    var prompt: String?
    var itemStyle: Style
}

external interface PickerProps : PickerPropsBase, ViewProps {
    var mode: String?
}

external class Picker : Component<PickerProps, RState> {
    override fun render(): dynamic
}