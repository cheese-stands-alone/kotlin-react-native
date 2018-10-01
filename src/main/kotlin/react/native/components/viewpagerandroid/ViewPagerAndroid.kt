@file:JsModule("react-native")

package react.native.components.viewpagerandroid

import react.Component
import react.RProps
import react.RState
import react.native.components.view.NativeEvent
import react.native.components.view.ViewProps

external interface ViewPagerAndroidOnPageScrollEventData {
    var position: Number?
    var offset: Number?
}

external interface ViewPagerAndroidOnPageSelectedEventData {
    var position: Number?
}

external interface ViewPagerAndroidPropsBase : RProps {
    var number: Number
    var onPageScroll: ((NativeEvent<ViewPagerAndroidOnPageScrollEventData>) -> Unit)?
    var onPageSelected: ((NativeEvent<ViewPagerAndroidOnPageSelectedEventData>) -> Unit)?
    var pageMargin: Number?
    var peekEnabled: Boolean?
    var scrollEnabled: Boolean?
    var setPage: Number?
    var setPageWithoutAnimation: ((Number) -> Unit)?

}

external interface ViewPagerAndroidProps : ViewPagerAndroidPropsBase, ViewProps {
    var keyboardDismissMode: String?
    var onPageScrollStateChanged: ((String) -> Unit)?
}

external class ViewPagerAndroid : Component<ViewPagerAndroidProps, RState> {
    override fun render(): dynamic
}