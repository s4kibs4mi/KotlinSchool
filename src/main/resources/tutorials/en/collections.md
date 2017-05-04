# Kotlin School

### Collections

#### Map
```kotlin
var map: MutableMap<String, Int> = mutableMapOf()
var mutableMap = mutableMapOf<String, Int>()
var finalMap: Map<String, Double> = mapOf()

var age = mutableMap.put("age", 23)
var age = mutableMap.get("age")
var roll = mutableMap.getOrDefault("roll", 10)
var roll = mutableMap.getOrPut("roll") { 10 }
var roll = mutableMap.getOrElse("roll") { 10 }
```
`MutableMap` is modifiable, other hand you can't make change in `Map`. It behaves like `final` of Java.

`getOrDefault` have two parameter `key` and `default value`. If key isn't found in map then default value will be returned.

`getOrPut` will store default value if key isn't found in map & will return it.

`getOrElse` behaves similarly like getOrDefault but won't return null.

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
