@file:JsModule("react-native")

package react.native.components.pickerIOS

import react.Component
import react.RProps
import react.RState
import react.native.api.Style
import react.native.components.view.ViewProps

external interface PickerIOSPropsBase : RProps {
    var onValueChange: ((dynamic, Number) -> Unit)?
    var selectedValue: dynamic
    var itemStyle: Style
}

external interface PickerIOSProps : PickerIOSPropsBase, ViewProps

external class PickerIOS : Component<PickerIOSProps, RState> {
    override fun render(): dynamic
}