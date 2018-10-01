package react.native.components.textinput

import react.RBuilder
import react.RElementBuilder
import react.native.Color
import react.native.StringEnum
import react.native.components.view.TypedViewProps
import react.native.fromValue

enum class AutoCapitalize(override val value: String) : StringEnum {
    NONE("none"),
    SENTENCES("sentences"),
    WORDS("words"),
    CHARACTERS("characters")
}

enum class ClearButtonMode(override val value: String) : StringEnum {
    NEVER("never"),
    WHILE_EDITING("while-editing"),
    UNLESS_EDITING("unless-editing"),
    ALWAYS("always")
}

enum class DataDetectorTypes(override val value: String) : StringEnum {
    PHONENUMBER("phoneNumber"),
    LINK("link"),
    ADDRESS("address"),
    CALABDAREVENT("calendarEvent"),
    NONE("none"),
    ALL("all")
}

enum class KeyboardAppearance(override val value: String) : StringEnum {
    DEFAULT("default"),
    DARK("dark"),
    LIGHT("light")
}

enum class KeyboardType(override val value: String) : StringEnum {
    DEFAULT("default"),
    EMAIL_ADDRESS("email-address"),
    NUMERIC("numeric"),
    PHONE_PAD("phone-pad"),
    ASCII_CAPABLE("ascii-capable"),
    NUMBERS_AND_PUNCTUATION("numbers-and-punctuation"),
    URL("url"),
    NUMBER_PAD("number-pad"),
    NAME_PHONE_PAD("name-phone-pad"),
    DECIMAL_PAD("decimal-pad"),
    TWITTER("twitter"),
    WEB_SEARCH("web-search"),
    VISIBLE_PASSWORD("visible-password")
}

enum class ReturnKeyType(override val value: String) : StringEnum {
    DONE("done"),
    GO("go"),
    NEXT("next"),
    SEARCH("search"),
    SEND("send"),
    NONE("none"),
    PREVIOUS("previous"),
    DEFAULT("default"),
    EMERGENCY_CALL("emergency-call"),
    GOOGLE("google"),
    JOIN("join"),
    ROUTE("route"),
    YAHOO("yahoo")
}

enum class TextContentType(override val value: String) : StringEnum {
    NONE("none"),
    URL("URL"),
    ADDRESSCITY("addressCity"),
    ADDRESSCITYANDSTATE("addressCityAndState"),
    ADDRESSSTATE("addressState"),
    COUNRTYNAME("countryName"),
    CREDITCARDNUMBER("creditCardNumber"),
    EMAILADDRESS("emailAddress"),
    FAMILYNAME("familyName"),
    FULLSTREETADDRESS("fullStreetAddress"),
    GIVENNAME("givenName"),
    JOBTITLE("jobTitle"),
    LOCATION("location"),
    MIDDLENAME("middleName"),
    NAME("name"),
    NAMEPREFIX("namePrefix"),
    NAMESUFFIX("nameSuffix"),
    NICKNAME("nickname"),
    ORGANIZATIONNAME("organizationName"),
    POSTCODE("postalCode"),
    STREEDADDRESSLINE1("streetAddressLine1"),
    STREEDADDRESSLINE2("streetAddressLine2"),
    SUBLOCALITY("sublocality"),
    TELEPHONENUMBER("telephoneNumber"),
    USERNAME("username"),
    PASSWORD("password")
}

enum class TextBreakStrategy(override val value: String) : StringEnum {
    SIMPLE("simple"),
    HIGH_QUALITY("highQuality"),
    BALANCED("balanced")
}

class TypedTextInputProps(builder: RElementBuilder<TextInputProps>)
    : TypedViewProps<TextInputProps>(builder), TextInputPropsBase by builder.attrs {
    var autoCapitalize: AutoCapitalize?
        get() = fromValue(builder.attrs.autoCapitalize)
        set(value) {
            builder.attrs.autoCapitalize = value?.value
        }
    var clearButtonMode: ClearButtonMode?
        get() = fromValue(builder.attrs.clearButtonMode)
        set(value) {
            builder.attrs.clearButtonMode = value?.value
        }
    var dataDetectorTypes: Iterable<DataDetectorTypes>?
        get() = builder.attrs.dataDetectorTypes?.mapNotNull { fromValue<DataDetectorTypes, String>(it) }
        set(value) {
            builder.attrs.dataDetectorTypes = value?.map { it.value }?.toTypedArray()
        }
    var keyboardAppearance: KeyboardAppearance?
        get() = fromValue(builder.attrs.keyboardAppearance)
        set(value) {
            builder.attrs.keyboardAppearance = value?.value
        }
    var keyboardType: KeyboardType?
        get() = fromValue(builder.attrs.keyboardType)
        set(value) {
            builder.attrs.keyboardType = value?.value
        }
    var placeholderTextColor: Color?
        get() = Color.of(builder.attrs.placeholderTextColor)
        set(value) {
            builder.attrs.placeholderTextColor = value?.value
        }
    var returnKeyType: ReturnKeyType?
        get() = fromValue(builder.attrs.returnKeyType)
        set(value) {
            builder.attrs.returnKeyType = value?.value
        }
    var selectionColor: Color?
        get() = Color.of(builder.attrs.selectionColor)
        set(value) {
            builder.attrs.selectionColor = value?.value
        }
    var textContentType: TextContentType?
        get() = fromValue(builder.attrs.textContentType)
        set(value) {
            builder.attrs.textContentType = value?.value
        }
    var textBreakStrategy: TextBreakStrategy?
        get() = fromValue(builder.attrs.textBreakStrategy)
        set(value) {
            builder.attrs.textBreakStrategy = value?.value
        }
    var underlineColorAndroid: Color?
        get() = Color.of(builder.attrs.underlineColorAndroid)
        set(value) {
            builder.attrs.underlineColorAndroid = value?.value
        }
}

fun RBuilder.textInput(
        block: (TypedTextInputProps.() -> Unit)? = undefined
) = child(TextInput::class) {
    if (block != undefined) TypedTextInputProps(this).run { block() }
}
