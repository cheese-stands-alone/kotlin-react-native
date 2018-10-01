@file:JsModule("react-native")

package react.native.components.toolbarandroid

import react.Component
import react.RProps
import react.RState
import react.native.components.image.ImageURISource
import react.native.components.view.ViewProps

external interface ToolbarAndroidAction {
    var title: String
    var icon: ImageURISource?
    var show: String?
    var showWithText: Boolean?
};

external interface ToolbarAndroidPropsBase : RProps {
    var overflowIcon: ImageURISource?
    var contentInsetStart: Number?
    var logo: ImageURISource?
    var navIcon: ImageURISource?
    var onActionSelected: ((Number) -> Unit)?
    var onIconClicked: (() -> Unit)?
    var contentInsetEnd: Number?
    var rtl: Boolean?
    var subtitle: String?
    var title: String?
}

external interface ToolbarAndroidProps : ToolbarAndroidPropsBase, ViewProps {
    var actions: Array<ToolbarAndroidAction>?
    var subtitleColor: String?
    var titleColor: String?
}

external class ToolbarAndroid : Component<ToolbarAndroidProps, RState> {
    override fun render(): dynamic
}