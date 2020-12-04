/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/12/3 16:38
 */

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    println(describeString(null))
}