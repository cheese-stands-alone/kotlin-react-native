@file:JsModule("react-native")

package react.native.api.actionsheetios

external interface ActionSheetIOSOptions {
    var title: String?
    var options: Array<String>?
    var cancelButtonIndex: Number?
    var destructiveButtonIndex: Number?
    var message: String?
    var tintColor: String?
}

external interface ShareActionSheetIOSOptions {
    var message: String?
    var url: String?
    var subject: String?
    var excludedActivityTypes: Array<String>?
}

external object ActionSheetIOS {
    fun showActionSheetWithOptions(options: ActionSheetIOSOptions, callback: (Number) -> Unit)
    fun showShareActionSheetWithOptions(
            options: ShareActionSheetIOSOptions,
            failureCallback: (error: Error) -> Unit,
            successCallback: (success: Boolean, method: String) -> Unit
    )
}