package react.native.components.scrollview

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class KeyboardDismissMode(override val value: String) : StringEnum {
    NONE("none"),
    ON_DRAG("on-drag"),
    INTERACTIVE("interactive")
}

enum class KeyboardShouldPersistTaps(override val value: String) : StringEnum {
    NEVER("never"),
    ALWAYS("always"),
    HANDLED("handled")
}

enum class OverScrollMode(override val value: String) : StringEnum {
    AUTO("auto"),
    ALWAYS("always"),
    NEVER("never")
}

enum class ContentInsetAdjustmentBehavior(override val value: String) : StringEnum {
    AUTOMATIC("automatic"),
    SCROLLABLEAXES("scrollableAxes"),
    NEVER("never"),
    ALWAYS("always")
}

enum class DecelerationRate(override val value: String) : StringEnum {
    FAST("fast"),
    NORMAL("normal")
}

enum class IndicatorStyle(override val value: String) : StringEnum {
    DEFAULT("default"),
    BLACK("black"),
    WHITE("white")
}

enum class SnapToAlignment(override val value: String) : StringEnum {
    START("start"),
    CENTER("center"),
    END("end")
}

class TypedScrollViewProps(builder: RElementBuilder<ScrollViewProps>)
    : TypedViewProps<ScrollViewProps>(builder), ScrollViewPropsBase by builder.attrs {
    var keyboardDismissMode: KeyboardDismissMode?
        get() = fromValue(builder.attrs.keyboardDismissMode)
        set(value) {
            builder.attrs.keyboardDismissMode = value?.value
        }
    var keyboardShouldPersistTaps: KeyboardShouldPersistTaps?
        get() = fromValue(builder.attrs.keyboardShouldPersistTaps)
        set(value) {
            builder.attrs.keyboardShouldPersistTaps = value?.value
        }
    var endFillColor: Color?
        get() = Color.of(builder.attrs.endFillColor)
        set(value) {
            builder.attrs.endFillColor = value?.value
        }
    var overScrollMode: OverScrollMode?
        get() = fromValue(builder.attrs.overScrollMode)
        set(value) {
            builder.attrs.overScrollMode = value?.value
        }
    var contentInsetAdjustmentBehavior: ContentInsetAdjustmentBehavior?
        get() = fromValue(builder.attrs.contentInsetAdjustmentBehavior)
        set(value) {
            builder.attrs.contentInsetAdjustmentBehavior = value?.value
        }
    var indicatorStyle: IndicatorStyle?
        get() = fromValue(builder.attrs.indicatorStyle)
        set(value) {
            builder.attrs.indicatorStyle = value?.value
        }
    var snapToAlignment: SnapToAlignment?
        get() = fromValue(builder.attrs.snapToAlignment)
        set(value) {
            builder.attrs.snapToAlignment = value?.value
        }
}

fun RBuilder.scrollView(
        block: (TypedScrollViewProps.() -> Unit)? = undefined
) = child(ScrollView::class) {
    if (block != undefined) TypedScrollViewProps(this).run { block() }
}