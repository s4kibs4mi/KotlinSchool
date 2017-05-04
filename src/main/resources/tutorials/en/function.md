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

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
