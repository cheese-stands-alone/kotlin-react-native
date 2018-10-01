@file:JsModule("react-native")

package react.native.components.refreshcontrol

import react.Component
import react.RProps
import react.RState
import react.native.components.view.ViewProps

external interface RefreshControlPropsBase : RProps {
    var refreshing: Boolean?
    var onRefresh: (() -> Unit)?
    var enabled: Boolean?
    var progressViewOffset: Number?
    var size: dynamic
    var title: String?

}

external interface RefreshControlProps : RefreshControlPropsBase, ViewProps {
    var colors: Array<String>?
    var progressBackgroundColor: String?
    var tintColor: String?
    var titleColor: String?
}

external class RefreshControl : Component<RefreshControlProps, RState> {
    override fun render(): dynamic
}