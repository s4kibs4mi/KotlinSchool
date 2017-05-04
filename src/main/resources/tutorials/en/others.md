# Kotlin School

### Others

#### Null Safety
```kotlin
var x: String = null    // It will give compile time error
var x: String? = null   // It will execute
```
Because if null safety you can't make variables value null unless you declare it.
In 2nd line of above example we have declared that x value can be null by `?` sign.

```kotlin
var name: String? = null
var nonNullName = name!!
```
WTF `!!` operator ? Well, if value of a variable is null then it will return a non null value. In above example name declared as null but in second line when we applied `!!` to name then it will return a non null value.

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
