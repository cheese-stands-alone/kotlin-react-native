@file:JsModule("react-native")

package react.native.components.tabbarIOS.item

import react.Component
import react.RProps
import react.RState
import react.native.components.image.ImageURISource
import react.native.components.view.ViewProps

external interface TabBarIOSItemPropsBase : RProps {
    var selected: Boolean?
    var badge: dynamic
    var icon: ImageURISource?
    var onPress: (() -> Unit)?
    var renderAsOriginal: Boolean?
    var selectedIcon: ImageURISource?
    var title: String
    var isTVSelectable: Boolean?
}

external interface TabBarIOSItemProps : TabBarIOSItemPropsBase, ViewProps {
    var badgeColor: String?
    var systemIcon: String?
}

external class TabBarIOSItem : Component<TabBarIOSItemProps, RState> {
    override fun render(): dynamic
}