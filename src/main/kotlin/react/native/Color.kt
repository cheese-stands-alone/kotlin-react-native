package react.native

inline class Color(val value: String) {
    companion object {
        fun of(arg: String?): Color? = if (arg == null) null else Color(arg)
        fun rgb(r: Int, g: Int, b: Int) = Color("rgb($r, $g, $b)")
        fun rga(r: Int, g: Int, b: Int, a: Double) = Color("rgba($r, $g, $b, $a)")
        fun hsl(hue: Int, saturation: Int, lightness: Int) = Color("hsl($hue, $saturation%, $lightness%)")
        fun hsla(hue: Int, saturation: Int, lightness: Int, alpha: Double) = Color("hsla($hue, $saturation%, $lightness%, $alpha)")
    }
}