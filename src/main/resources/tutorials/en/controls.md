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
`when` is the replacement of `switch case`. In place of case you can also use String, Int, Double and other data types but case types must be same.

##### Loop
```kotlin
// array iteration through loop
val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)  // Final list
for (number in numbers) {
    println(number)
}

// Loop within range
val len = 50
for (i in 1..len) {
    println("$i")
}

// While loop
while(true) {
    println("Infinite loop")
}

do {
    println("Infinite loop")
} while(true)
```

###### Brought to you by Sakib Sami
