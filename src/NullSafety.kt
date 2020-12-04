/**
 * @author 刘世豪
 * @title
 * @description
 * @updateTime 2020/12/3 16:16
 */

fun main() {
    var neverNull: String = "This can`t be null"
//    neverNull = null    // Null can not be a value of a non-null type String

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null  // Null can not be a value of a non-null type String

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
//    strLength(nullable)     // Type mismatch: inferred type is Nothing? but String was expected
}