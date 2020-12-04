/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/12/3 16:44
 */

class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()
    println(customer)

    val contact = Contact(1, "xxx@qq.com")
    println(contact.id)
    contact.email = "xxx.163.com"
    println(contact.email)
}
