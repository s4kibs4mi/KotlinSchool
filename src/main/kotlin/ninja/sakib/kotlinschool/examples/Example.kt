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

    var value = if (x > y) x else y

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

    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
    for (number in numbers) {
        println(number)
    }
    for ((index, number) in numbers.withIndex()) {
        println("Index : $index, Number : $number")
    }

    numbers.forEach {
        println("$it")
    }

    val len = 50
    for (i in 1..len) {
        println("$i")
    }

    // Nested loop with label
    parent@ for (i in 1..10 step 2) {
        child@ for (j in 1..10) {
            if (j == 5)
                break

            if (i * j > 50)
                break@child     // Exists from child loop

            if (i == 5)
                break@parent    // Exists from parent loop
        }
    }

    var name: String? = null
    var nonNullName = name!!

    var map: MutableMap<String, Int> = mutableMapOf()
    var mutableMap = mutableMapOf<String, Int>()
    var finalMap: Map<String, Double> = mapOf()

    var age = mutableMap.put("age", 23)
    age = mutableMap.get("age")
    var roll = mutableMap.getOrDefault("roll", 10)
    mutableMap.getOrPut("roll") { 10 }
    mutableMap.toSortedMap(Comparator { o1, o2 ->
        o1.compareTo(o2)    // Sort by value
    })
}

// Function with no parameter & no return type
fun function() {
    val sum = 1 sum 2

    withDefaultValue(10)
    withDefaultValue(10, 10)
    withDefaultValue(10, z = "SomeText")
}

fun withDefaultValue(x: Int, y: Int = 0, z: String = "") {

}

infix fun Int.sum(x: Int): Int {
    return this + x
}
