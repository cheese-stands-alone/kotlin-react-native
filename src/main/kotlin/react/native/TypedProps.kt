package react.native

import react.RElementBuilder
import react.RProps
import react.native.api.Style

@DslMarker
private annotation class TypedPropsType

@TypedPropsType
abstract class TypedProps<T : RProps>(val builder: RElementBuilder<T>) {
    open var style: Style
        get() = builder.attrs.asDynamic().style
        set(value) {
            builder.attrs.asDynamic().style = value
        }
}