package react.native.components.refreshcontrol

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.components.view.TypedViewProps

class TypedRefreshControlProps(builder: RElementBuilder<RefreshControlProps>)
    : TypedViewProps<RefreshControlProps>(builder), RefreshControlPropsBase by builder.attrs {
    var colors: Iterable<Color>?
        get() = builder.attrs.colors?.map { Color(it) }
        set(value) {
            builder.attrs.colors = value?.map { it.value }?.toTypedArray()
        }
    var progressBackgroundColor: Color?
        get() = Color.of(builder.attrs.progressBackgroundColor)
        set(value) {
            builder.attrs.progressBackgroundColor = value?.value
        }
    var tintColor: Color?
        get() = Color.of(builder.attrs.tintColor)
        set(value) {
            builder.attrs.tintColor = value?.value
        }
    var titleColor: Color?
        get() = Color.of(builder.attrs.titleColor)
        set(value) {
            builder.attrs.titleColor = value?.value
        }
}

fun RBuilder.refreshControl(
        block: (TypedRefreshControlProps.() -> Unit)? = undefined
) = child(RefreshControl::class) {
    if (block != undefined) TypedRefreshControlProps(this).run { block() }
}
