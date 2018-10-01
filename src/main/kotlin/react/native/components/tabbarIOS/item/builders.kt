package react.native.components.tabbarIOS.item

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class SystemIcon(override val value: String) : StringEnum {
    BOOKMARKS("bookmarks"),
    CONTACTS("contacts"),
    DOWNLOADS("downloads"),
    FAVORITES("favorites"),
    FEATURED("featured"),
    HISTORY("history"),
    MORE("more"),
    MOST_RECENT("most-recent'"),
    MOST_VIEWED("most-viewed"),
    RECENTS("recents"),
    SEARCH("search"),
    TOP_RATED("top-rated")
}


class TypedTabBarIOSItemProps(builder: RElementBuilder<TabBarIOSItemProps>)
    : TypedViewProps<TabBarIOSItemProps>(builder), TabBarIOSItemPropsBase by builder.attrs {
    var barStyle: SystemIcon?
        get() = fromValue(builder.attrs.systemIcon)
        set(value) {
            builder.attrs.systemIcon = value?.value
        }
    var badgeColor: Color?
        get() = Color.of(builder.attrs.badgeColor)
        set(value) {
            builder.attrs.badgeColor = value?.value
        }
}

fun RBuilder.tabBarIOSItem(
        block: (TypedTabBarIOSItemProps.() -> Unit)? = undefined
) = child(TabBarIOSItem::class) {
    if (block != undefined) TypedTabBarIOSItemProps(this).run { block() }
}
