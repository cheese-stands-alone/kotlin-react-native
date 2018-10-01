@file:JsModule("react-native")

package react.native.components.drawerlayoutandroid

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.components.view.ViewProps

external interface DrawerLayoutAndroidPropsBase : RProps {
    var renderNavigationView: (() -> ReactElement)?
    var onDrawerClose: (() -> Unit)?
    var drawerPosition: dynamic
    var drawerWidth: Number?
    var onDrawerOpen: (() -> Unit)?
    var onDrawerSlide: (() -> Unit)?
}

external interface DrawerLayoutAndroidProps : DrawerLayoutAndroidPropsBase, ViewProps {
    var keyboardDismissMode: String?
    var drawerLockMode: String?
    var onDrawerStateChanged: ((String) -> Unit)?
    var drawerBackgroundColor: String?
    var statusBarBackgroundColor: String?
}

external class DrawerLayoutAndroid : Component<DrawerLayoutAndroidProps, RState> {
    override fun render(): dynamic

    fun openDrawer()
    fun closeDrawer()
}