/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/12/2 16:22
 */

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye")

    // operator fun String.get(range: IntRange) = this.substring(range)
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemier; nothing annoys them so much."
    println(str[0..14])
}