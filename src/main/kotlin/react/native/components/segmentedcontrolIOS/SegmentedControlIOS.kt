@file:JsModule("react-native")

package react.native.components.segmentedcontrolIOS

import react.Component
import react.RProps
import react.RState
import react.native.components.slider.NativeSegmentedControlIOSChangeEvent
import react.native.components.view.NativeEvent
import react.native.components.view.ViewProps

external interface NativeSegmentedControlIOSChangeEvent {
    var value: String?
    var selectedSegmentIndex: Number?
    var target: Number?
}

external interface SegmentedControlIOSPropsBase : RProps {
    var enabled: Boolean?
    var momentary: Boolean
    var onChange: ((NativeEvent<NativeSegmentedControlIOSChangeEvent>) -> Unit)?
    var onValueChange: ((String) -> Unit)?
    var selectedIndex: Number?
    var tintColor: String?
    var values: Array<String>?
}

external interface SegmentedControlIOSProps : SegmentedControlIOSPropsBase, ViewProps

external class SegmentedControlIOS : Component<SegmentedControlIOSProps, RState> {
    override fun render(): dynamic
}