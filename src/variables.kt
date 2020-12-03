/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/12/3 10:40
 */

fun main() {
    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3

    // var d: Int   // Variable 'd' must be initialized
    // println(d)

    val e: Int
    /*val e: Int = if (someCondition()) {
        1
    } else {
        2
    }*/
    if (someCondition()) {
        e = 1
    } else {
        e = 2
    }
    println(e)
}

fun someCondition() = true