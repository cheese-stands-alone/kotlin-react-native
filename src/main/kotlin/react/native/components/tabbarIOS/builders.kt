package react.native.components.tabbarIOS

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class BarStyle(override val value: String) : StringEnum {
    DEFAULT("default"),
    BLACK("black")
}

enum class ItemPositioning(override val value: String) : StringEnum {
    FILL("fill"),
    CENTER("center"),
    AUTO("auto")
}

class TypedTabBarIOSProps(builder: RElementBuilder<TabBarIOSProps>)
    : TypedViewProps<TabBarIOSProps>(builder), TabBarIOSPropsBase by builder.attrs {
    var barStyle: BarStyle?
        get() = fromValue(builder.attrs.barStyle)
        set(value) {
            builder.attrs.barStyle = value?.value
        }
    var barTintColor: Color?
        get() = Color.of(builder.attrs.barTintColor)
        set(value) {
            builder.attrs.barTintColor = value?.value
        }
    var itemPositioning: ItemPositioning?
        get() = fromValue(builder.attrs.itemPositioning)
        set(value) {
            builder.attrs.itemPositioning = value?.value
        }
    var tintColor: Color?
        get() = Color.of(builder.attrs.tintColor)
        set(value) {
            builder.attrs.tintColor = value?.value
        }
    var unselectedItemTintColor: Color?
        get() = Color.of(builder.attrs.unselectedItemTintColor)
        set(value) {
            builder.attrs.unselectedItemTintColor = value?.value
        }
    var unselectedTintColor: Color?
        get() = Color.of(builder.attrs.unselectedTintColor)
        set(value) {
            builder.attrs.unselectedTintColor = value?.value
        }
}

fun RBuilder.tabBarIOS(
        block: (TypedTabBarIOSProps.() -> Unit)? = undefined
) = child(TabBarIOS::class) {
    if (block != undefined) TypedTabBarIOSProps(this).run { block() }
}
