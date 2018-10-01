@file:JsModule("react-native")

package react.native.components.virtualizedlist

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import react.native.components.scrollview.ScrollViewProps

external interface ItemLayout {
    var length: Number
    var offset: Number
    var index: Number
}

external interface ScrollToIndexFailed {
    var index: Number
    var highestMeasuredFrameIndex: Number
    var averageItemLength: Number
}

external interface ViewableItemsChanged {
    var viewableItems: Array<dynamic>
    var changed: Array<dynamic>
}

external interface EndReached {
    var distanceFromEnd: Number
}

external interface VirtualizedListPropsBase<T> : RProps {
    var renderItem: ((dynamic) -> ReactElement?)?
    var data: T?
    var getItem: ((data: T, index: Number) -> Any)?
    var getItemCount: ((T) -> Number)?
    var debug: Boolean?
    var extraData: dynamic
    var getItemLayout: ((data: T, index: Number) -> ItemLayout)?
    var initialScrollIndex: Number?
    var inverted: Boolean?
    var CellRendererComponent: dynamic
    var ListEmptyComponent: dynamic
    var ListHeaderComponent: dynamic
    var ListFooterComponent: dynamic
    var onRefresh: (() -> Unit)?
    var onScrollToIndexFailed: ((ScrollToIndexFailed) -> Unit)?
    var onViewableItemsChanged: ((ViewableItemsChanged) -> Unit)?
    var refreshing: Boolean?
    var renderScrollComponent: ((dynamic) -> ReactElement)?
    var initialNumToRender: Number?
    var keyExtractor: ((item: dynamic, index: Number) -> String)?
    var maxToRenderPerBatch: Number?
    var onEndReached: ((EndReached) -> Unit)?
    var onEndReachedThreshold: Number?
    var updateCellsBatchingPeriod: Number?
    var windowSize: Number?
    var progressViewOffset: Number?
}

external interface VirtualizedListProps<T> : VirtualizedListPropsBase<T>, ScrollViewProps

external class VirtualizedList<T> : Component<VirtualizedListProps<T>, RState> {
    override fun render(): dynamic

    fun scrollToEnd()
    fun scrollToIndex(params: dynamic = definedExternally)
    fun scrollToItem(params: dynamic = definedExternally)
    fun scrollToOffset(params: dynamic = definedExternally)
    fun recordInteraction()
    fun flashScrollIndicators()
}