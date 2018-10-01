package react.native.components.drawerlayoutandroid

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class KeyboardDismissMode(override val value: String) : StringEnum {
    NONE("none"),
    ON_DRAG("on-drag");
}

enum class DrawerLockMode(override val value: String) : StringEnum {
    UNLOCKED("unlocked"),
    LOCKED_CLOSED("locked-closed"),
    LOCKED_OPEN("locked-open");
}

enum class DrawerStateChanged(override val value: String) : StringEnum {
    IDLE("Idle"),
    DRAGGING("Dragging"),
    SETTLING("Settling")
}

class TypedDrawerLayoutAndroid(builder: RElementBuilder<DrawerLayoutAndroidProps>)
    : TypedViewProps<DrawerLayoutAndroidProps>(builder), DrawerLayoutAndroidPropsBase by builder.attrs {
    var keyboardDismissMode: KeyboardDismissMode?
        get() = fromValue(builder.attrs.keyboardDismissMode)
        set(value) {
            builder.attrs.keyboardDismissMode = value?.value
        }
    var drawerLockMode: DrawerLockMode?
        get() = fromValue(builder.attrs.drawerLockMode)
        set(value) {
            builder.attrs.drawerLockMode = value?.value
        }
    private var dawerStateChanged: ((DrawerStateChanged) -> Unit)? = null
    var onDrawerStateChanged: ((DrawerStateChanged) -> Unit)?
        get() = when {
            dawerStateChanged != null -> dawerStateChanged
            builder.attrs.onDrawerStateChanged != null -> {
                val oldFun = builder.attrs.onDrawerStateChanged!!
                val newFun: (DrawerStateChanged?) -> Unit = { }
                builder.attrs.onDrawerStateChanged = {
                    oldFun(it)
                    newFun(fromValue(it))
                }
                dawerStateChanged = newFun
                newFun
            }
            else -> null
        }
        set(value) {
            value?.let { func ->
                dawerStateChanged = func
                builder.attrs.onDrawerStateChanged = { func(fromValue(it)!!) }
            }
        }
    var drawerBackgroundColor: Color?
        get() = Color.of(builder.attrs.drawerBackgroundColor)
        set(value) {
            builder.attrs.drawerBackgroundColor = value?.value
        }
    var statusBarBackgroundColor: Color?
        get() = Color.of(builder.attrs.statusBarBackgroundColor)
        set(value) {
            builder.attrs.statusBarBackgroundColor = value?.value
        }
}

fun RBuilder.drawerLayoutAndroid(
        block: (TypedDrawerLayoutAndroid.() -> Unit)? = undefined
) = child(DrawerLayoutAndroid::class) {
    if (block != undefined) TypedDrawerLayoutAndroid(this).run { block() }
}
