@file:JsModule("react-native")

package react.native.components.statusbar

import react.Component
import react.RProps
import react.RState
import react.native.components.view.ViewProps

external interface StatusBarPropsBase : RProps {
    var animated: Boolean?
    var hidden: Boolean
    var translucent: Boolean?
    var networkActivityIndicatorVisible: Boolean?
}

external interface StatusBarProps : StatusBarPropsBase, ViewProps {
    var barStyle: String?
    var backgroundColor: String?
    var showHideTransition: String?
}

external class StatusBar : Component<StatusBarProps, RState> {
    override fun render(): dynamic

    companion object {
        var currentHeight: Number?
        fun setHidden(hidden: Boolean, animation: String? = definedExternally)
        fun setBarStyle(style: String, animated: Boolean? = definedExternally)
        fun setNetworkActivityIndicatorVisible(visible: Boolean)
        fun setBackgroundColor(color: String, animated: Boolean? = definedExternally)
        fun setTranslucent(translucent: Boolean)
    }
}