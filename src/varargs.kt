/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/12/2 16:29
 */

fun main() {
    // vararg: 声明可变长参数
    fun printAll(vararg message: String) {
        for (m in message) println(m)
    }
    printAll("Hello", "Hello", "Salut", "Hola", "liush")

    fun printAllWithPrefix(vararg message: String, prefix: String) {
        for (m in message) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Hello", "Salut", "Hola", "liush", prefix = "Kotlin: ")

    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("1", "2", "3", "4", "5")
}