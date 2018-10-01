@file:JsModule("react-native")

package react.native.components.navigatorIOS

import react.Component
import react.RProps
import react.RState
import react.native.components.view.ViewProps

external interface Route<T : Component<P, *>, P : RProps> {
    var component: JsClass<T>
    var id: String?
    var title: String?
    var passProps: P?
}

external interface NavigatorIOSPropsBase<T : Component<P, *>, P : RProps> : RProps {
    var initialRoute: Route<T, P>?
    var barTintColor: String?
    var interactivePopGestureEnabled: Boolean?
    var navigationBarHidden: Boolean?
    var shadowHidden: Boolean
    var tintColor: String?
    var titleTextColor: Boolean?
    var translucent: Boolean?
}

external interface NavigatorIOSProps<T : Component<P, *>, P : RProps> : NavigatorIOSPropsBase<T, P>, ViewProps {
    var barStyle: String?
}

external class NavigatorIOS<T : Component<P, *>, P : RProps> : Component<NavigatorIOSProps<T, P>, RState> {
    override fun render(): dynamic

    fun push(route: Route<T, P>)
    fun pop()
    fun popN(n: Number)
    fun replace(route: Route<T, P>)
    fun replacePrevious(route: Route<T, P>)
    fun replacePreviousAndPop(route: Route<T, P>)
    fun resetTo(route: Route<T, P>)
    fun popToRoute(route: Route<T, P>)
    fun popToTop()
}