package react.native.components.viewpagerandroid

import react.RBuilder
import react.RElementBuilder
import react.native.StringEnum
import react.native.components.drawerlayoutandroid.DrawerStateChanged
import react.native.components.drawerlayoutandroid.KeyboardDismissMode
import react.native.components.view.TypedViewProps
import react.native.fromValue

class TypedViewPagerAndroidProps(builder: RElementBuilder<ViewPagerAndroidProps>)
    : TypedViewProps<ViewPagerAndroidProps>(builder), ViewPagerAndroidPropsBase by builder.attrs {
    var progressViewStyle: KeyboardDismissMode?
        get() = fromValue(builder.attrs.keyboardDismissMode)
        set(value) {
            builder.attrs.keyboardDismissMode = value?.value
        }
    private var onPageScrollStateChanged: ((DrawerStateChanged) -> Unit)? = null
    var onDrawerStateChanged: ((DrawerStateChanged) -> Unit)?
        get() = when {
            onPageScrollStateChanged != null -> onPageScrollStateChanged
            builder.attrs.onPageScrollStateChanged != null -> {
                val oldFun = builder.attrs.onPageScrollStateChanged!!
                val newFun: (DrawerStateChanged?) -> Unit = { }
                builder.attrs.onPageScrollStateChanged = {
                    oldFun(it)
                    newFun(fromValue(it))
                }
                onPageScrollStateChanged = newFun
                newFun
            }
            else -> null
        }
        set(value) {
            value?.let { func ->
                onPageScrollStateChanged = func
                builder.attrs.onPageScrollStateChanged = { func(fromValue(it)!!) }
            }
        }
}

fun RBuilder.viewPagerAndroid(
        block: (TypedViewPagerAndroidProps.() -> Unit)? = undefined
) = child(ViewPagerAndroid::class) {
    if (block != undefined) TypedViewPagerAndroidProps(this).run { block() }
}
