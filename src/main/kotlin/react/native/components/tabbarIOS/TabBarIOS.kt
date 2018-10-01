@file:JsModule("react-native")

package react.native.components.tabbarIOS

import react.Component
import react.RProps
import react.RState
import react.native.components.view.ViewProps

external interface TabBarIOSPropsBase : RProps {
    var translucent: Boolean?

}

external interface TabBarIOSProps : TabBarIOSPropsBase, ViewProps {
    var barStyle: String?
    var barTintColor: String?
    var itemPositioning: String?
    var tintColor: String?
    var unselectedItemTintColor: String?
    var unselectedTintColor: String?
}

external class TabBarIOS : Component<TabBarIOSProps, RState> {
    override fun render(): dynamic
}