@file:JsModule("react-native")

package react.native.components.datepickerIOS

import react.Component
import react.RProps
import react.RState
import kotlin.js.Date

external interface DatePickerIOSPropsBase : RProps {
    var date: Date?
    var onDateChange: ((date: Date) -> Unit)?
    var maximumDate: Date?
    var minimumDate: Date?
    var locale: String?
    var timeZoneOffsetInMinutes: Number?
}

external interface DatePickerIOSProps : DatePickerIOSPropsBase {
    var minuteInterval: Number?
    var mode: String?
}

external class DatePickerIOS : Component<DatePickerIOSProps, RState> {
    override fun render(): dynamic
}