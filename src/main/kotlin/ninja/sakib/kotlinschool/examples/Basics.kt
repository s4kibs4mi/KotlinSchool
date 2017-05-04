package ninja.sakib.kotlinschool.examples

import kotlin.properties.Delegates

/**
 * := Coded with love by Sakib Sami on 5/3/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

val a: Int = 10
var b: Int = 0

val name = "Sakib Sami"
var address: String by Delegates.notNull<String>()

fun operations() {
    b = 10
    var sum = a + b
}


fun conditions() {
    var x = 10
    var y = 20

    if (x == y) {
        println("$x equal to $y")
    } else if (x > y) {
        println("$x greater than $y")
    } else {
        println("$x less than $y")
    }

    when (x) {
        10 -> {
            println("X == 10")
        }
        20 -> {
            println("X == 20")
        }
        21, 22, 23 -> {
            println("Multiple values together")
        }
        in x..y -> {
            println("Value is in range of $x and $y")
        }
        !in x..y -> {
            println("Value is not in range of $x and $y")
        }
        else -> {
            println("Unchecked value $x")
        }
    }
}
