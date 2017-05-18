# Kotlin School

### Function

Function with no parameter & no return type
```kotlin
fun dummy() {

}
```

Function with parameter & return type
```kotlin
fun sum(x: Int, y: Int): Int{
    return x + y
}
// Function is taking two parameter as input which are Int type
// & returns sum of them
```

Using `infix` function you can attach function with class/data types
```kotlin
infix fun Int.sum(x: Int): Int {
    return this + x
}

val s = 1 sum 2 // It will return 3 (1 + 2)
```

Single expression function
```kotlin
fun rem(x: Int, y: Int) = x % y
val r = rem(5, 2)
```

Function with default value
```kotlin
fun withDefaultValue(x: Int, y: Int = 0, z: String = "") {

}

withDefaultValue(10)    // Pass only required value
withDefaultValue(10, 10)    // Pass value by order
withDefaultValue(10, z = "SomeText")    // Pass value by name
```

Extension Function
```kotlin
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

val x: Int = 0
println(x.str())
```
Using extension function you can add function to a class, even if the class is in a third party library. You do not need to have access to the class.

In above example `str()` method is avialable to object of `Int` class.

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
