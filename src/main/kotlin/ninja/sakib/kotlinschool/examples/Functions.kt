package ninja.sakib.kotlinschool.examples

/**
 * := Coded with love by Sakib Sami on 5/18/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

// Example of extension function
fun Int.str(): String {
    when (this) {
        0 -> return "ZERO"
        1 -> return "ONE"
        2 -> return "TWO"
        3 -> return "THREE"
        4 -> return "FOUR"
        5 -> return "FIVE"
        else -> return ""
    }
}

fun main(args: Array<String>) {
    val x: Int = 1
    println(x.str())
}
