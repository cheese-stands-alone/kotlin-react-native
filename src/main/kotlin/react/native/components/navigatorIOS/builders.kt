package react.native.components.navigatorIOS

import react.Component
import react.RBuilder
import react.RElementBuilder
import react.RProps
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue
import kotlin.reflect.KClass

enum class BarStyle(override val value: String) : StringEnum {
    DEFAULT("default"),
    BLACK("black")
}

class TypedNavigatorIOSProps<T : Component<P, *>, P : RProps>(builder: RElementBuilder<NavigatorIOSProps<T, P>>)
    : TypedViewProps<NavigatorIOSProps<T, P>>(builder), NavigatorIOSPropsBase<T, P> by builder.attrs {
    var barStyle: BarStyle?
        get() = fromValue(builder.attrs.barStyle)
        set(value) {
            builder.attrs.barStyle = value?.value
        }
}

fun <T : Component<P, *>, P : RProps> RBuilder.navigatorIOS(
        block: (TypedNavigatorIOSProps<T, P>.() -> Unit)? = undefined
) = child(NavigatorIOS::class as KClass<NavigatorIOS<T, P>>) {
    if (block != undefined) TypedNavigatorIOSProps(this).run { block() }
}
