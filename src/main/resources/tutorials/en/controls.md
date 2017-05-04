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

###### Brought to you by Sakib Sami
