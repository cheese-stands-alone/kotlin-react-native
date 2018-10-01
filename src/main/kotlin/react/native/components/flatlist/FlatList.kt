@file:JsModule("react-native")

package react.native.components.flatlist

import react.Component
import react.RProps
import react.RState
import react.native.api.Style
import react.native.components.virtualizedlist.VirtualizedListProps


external interface FlatListPropsBase : RProps {
    var ItemSeparatorComponent: dynamic
    var columnWrapperStyle: Style?
    var numColumns: Number?
}

external interface FlatListProps<T> : FlatListPropsBase, VirtualizedListProps<T>

external class FlatList<T> : Component<FlatListProps<T>, RState> {
    override fun render(): dynamic

    fun scrollToEnd()
    fun scrollToIndex(params: dynamic = definedExternally)
    fun scrollToItem(params: dynamic = definedExternally)
    fun scrollToOffset(params: dynamic = definedExternally)
    fun recordInteraction()
    fun flashScrollIndicators()
}