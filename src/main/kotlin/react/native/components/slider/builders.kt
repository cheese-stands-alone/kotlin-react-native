package react.native.components.slider

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.components.view.TypedViewProps

class TypedSliderProps(builder: RElementBuilder<SliderProps>)
    : TypedViewProps<SliderProps>(builder), SliderPropsBase by builder.attrs {
    var minimumTrackTintColor: Color?
        get() = Color.of(builder.attrs.minimumTrackTintColor)
        set(value) {
            builder.attrs.minimumTrackTintColor = value?.value
        }
    var maximumTrackTintColor: Color?
        get() = Color.of(builder.attrs.maximumTrackTintColor)
        set(value) {
            builder.attrs.maximumTrackTintColor = value?.value
        }
    var thumbTintColor: Color?
        get() = Color.of(builder.attrs.thumbTintColor)
        set(value) {
            builder.attrs.thumbTintColor = value?.value
        }
}

fun RBuilder.slider(
        block: (TypedSliderProps.() -> Unit)? = undefined
) = child(Slider::class) {
    if (block != undefined) TypedSliderProps(this).run { block() }
}
