@file:JsModule("react-native")

package react.native.components.sectionlist

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.components.virtualizedlist.VirtualizedListProps

external interface Separators {
    fun highlight()
    fun unhighlight()
    fun updateProps(select: String, newProps: Any)
}

external interface SectionHolder<T> {
    var section: Section<T>
}

external interface ListRenderItemInfo<T> : SectionHolder<T> {
    var item: T
    var index: Number
    var separators: Separators
}

external interface Section<T> {
    var data: Array<T>
    var key: String?
    var renderItem: ((info: ListRenderItemInfo<T>) -> ReactElement)?
    var ItemSeparatorComponent: dynamic
    var keyExtractor: (item: T, index: Number) -> String
}

external interface SectionListPropsBase<T> : RProps {
    var sections: Array<Section<T>>?
    var removeClippedSubviews: Boolean?
    var renderSectionFooter: ((info: SectionHolder<T>) -> ReactElement)?
    var renderSectionHeader: ((info: SectionHolder<T>) -> ReactElement)?
    var SectionSeparatorComponent: dynamic
    var stickySectionHeadersEnabled: Boolean
}

external interface SectionListProps<T> : SectionListPropsBase<T>, VirtualizedListProps<T> {
}

external interface SectionListScrollParams {
    var animated: Boolean?
    var itemIndex: Number
    var sectionIndex: Number
    var viewOffset: Number?
    var viewPosition: Number?
}

external class SectionList<T> : Component<SectionListProps<T>, RState> {
    override fun render(): dynamic

    fun scrollToLocation(param: SectionListScrollParams)
    fun recordInteraction()
    fun flashScrollIndicators()
}