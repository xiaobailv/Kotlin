/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/12/2 16:07
 */
class Person(val name: String){
    val likedPerson = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPerson.add(other)
    }
}

fun main(){
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")  // println(2 times(Bye))

    val pair = "Ferrari" to "Katrina"
    println(pair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}