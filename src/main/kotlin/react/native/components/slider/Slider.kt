@file:JsModule("react-native")

package react.native.components.slider

import react.Component
import react.RProps
import react.RState
import react.native.components.image.ImageURISource
import react.native.components.view.ViewProps

external interface NativeSegmentedControlIOSChangeEvent {
    var value: String?
    var selectedSegmentIndex: Number?
    var target: Number?
}

external interface SliderPropsBase : RProps {
    var disabled: Boolean?
    var maximumValue: Number?
    var minimumValue: Number?
    var onSlidingComplete: ((Number) -> Unit)?
    var onValueChange: ((Number) -> Unit)?
    var step: Number?
    var value: Number?
    var maximumTrackImage: ImageURISource?
    var minimumTrackImage: ImageURISource?
    var thumbImage: ImageURISource?
    var trackImage: ImageURISource?
}

external interface SliderProps : SliderPropsBase, ViewProps {
    var minimumTrackTintColor: String?
    var maximumTrackTintColor: String?
    var thumbTintColor: String?
}

external class Slider : Component<SliderProps, RState> {
    override fun render(): dynamic
}