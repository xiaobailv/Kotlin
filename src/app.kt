/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/6/10 15:12
 */

class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
//    println("Hello World")
    Greeter("刘世豪").greet()
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    sum(1, 2)
    multiply(2, 4)
}
