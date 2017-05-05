# Kotlin School

### Controls

#### Conditions
##### if else
```kotlin
var x = 10
var y = 20

if(x > y) {
    println("$x is greater than $y")
} else if(x == y) {
    println("$x is equal to $y")
} else {
    println("$x is less than $y")
}

var value = if (x > y) x else y
```

##### when
```kotlin
var x = 10

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
```
`when` is the replacement of `switch case`. In place of case you can also use String, Int, Double and other data types but case types must be same. In above example type is `Int`.

##### Loop
```kotlin
// array iteration through loop
val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)  // Final list
for (number in numbers) {
    println(number)
}

// Loop with index
for ((index, number) in numbers.withIndex()) {
    println("Index : $index, Number : $number")
}

// Loop within range
val len = 50
for (i in 1..len) {
    println("$i")
}

numbers.forEach {
    println("$it")
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
    
    if(i == 9)
        break
}

// While loop
while(true) {
    println("Infinite loop")
}

do {
    println("Infinite loop")
} while(true)
```

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
