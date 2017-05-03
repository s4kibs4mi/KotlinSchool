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
