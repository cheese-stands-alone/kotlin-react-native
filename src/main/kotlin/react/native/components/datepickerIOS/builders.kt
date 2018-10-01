package react.native.components.datepickerIOS

import react.RBuilder
import react.RElementBuilder
import react.native.IntEnum
import react.native.StringEnum
import react.native.TypedProps
import react.native.fromValue

enum class MinuteInterval(override val value: Int) : IntEnum {
    ONE(1),
    TWO(2),
    THREE(3),
    FORE(4),
    FIVE(5),
    SIX(6),
    TEN(10),
    TWELVE(12),
    FIFTEEN(15),
    TWENTY(20),
    THIRTY(30);
}

enum class Mode(override val value: String) : StringEnum {
    DATE("date"),
    TIME("time"),
    DATETIME("datetime")
}

class TypedDatePickerIOSProps(builder: RElementBuilder<DatePickerIOSProps>)
    : TypedProps<DatePickerIOSProps>(builder), DatePickerIOSPropsBase by builder.attrs {
    var minuteInterval: MinuteInterval?
        get() = fromValue(builder.attrs.minuteInterval?.toInt())
        set(value) {
            builder.attrs.minuteInterval = value?.value
        }
    var mode: Mode?
        get() = fromValue(builder.attrs.mode)
        set(value) {
            builder.attrs.mode = value?.value
        }
}

fun RBuilder.datePickerIOS(
        block: (TypedDatePickerIOSProps.() -> Unit)? = undefined
) = child(DatePickerIOS::class) {
    if (block != undefined) TypedDatePickerIOSProps(this).run { block() }
}
