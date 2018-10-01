package react.native.components.switch

import kotlinext.js.jsObject
import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.components.view.TypedViewProps

class TrackColor(val False: Color, val True: Color)

class TypedSwitchProps(builder: RElementBuilder<SwitchProps>)
    : TypedViewProps<SwitchProps>(builder), SwitchPropsBase by builder.attrs {
    var trackColor: TrackColor?
        get() = builder.attrs.trackColor?.let { TrackColor(Color(it.`false` ?: ""), Color(it.`true` ?: "")) }
        set(value) {
            builder.attrs.trackColor = value?.let {
                jsObject {
                    `false` = it.False.value
                    `true` = it.True.value
                }
            }
        }
    var ios_backgroundColor: Color?
        get() = Color.of(builder.attrs.ios_backgroundColor)
        set(value) {
            builder.attrs.ios_backgroundColor = value?.value
        }
    var thumbTintColor: Color?
        get() = Color.of(builder.attrs.thumbTintColor)
        set(value) {
            builder.attrs.thumbTintColor = value?.value
        }
    var tintColor: Color?
        get() = Color.of(builder.attrs.tintColor)
        set(value) {
            builder.attrs.tintColor = value?.value
        }
}

fun RBuilder.switch(
        block: (TypedSwitchProps.() -> Unit)? = undefined
) = child(Switch::class) {
    if (block != undefined) TypedSwitchProps(this).run { block() }
}
