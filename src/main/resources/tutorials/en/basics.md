# Kotlin School

### Basics
Open terminal & execute,
`kotlin` it will open kotlin's interactive shell.

```shell
Welcome to Kotlin version 1.1.1 (JRE 1.8.0_111-b14)
Type :help for help, :quit for quit
>>>
```

#### Basic Data Types,
* Byte
* Short
* Int
* Long
* Float
* Double
* Boolean
* Char
* String

Remember everything in kotlin is class.

#### Statements
```kotlin
val a: Int = 10  // val equivalent to final in Java
var b: Int = 0
// property must be initialized

var name: String = "Sakib Sami"
var address: String by Delegates.notNull<String>()

b = 10
var sum = a + b
println("$name lives at $address")
```

#### Operations
```kotlin
var x1 = a + b
var x2 = a - b
var x3 = a * b
var x4 = a / b
var x5 = a % b
var x6 = a > b
var x7 = a < b
var x8 = a == b
var x9 = a >= b
var x0 = a <= b
```

###### Brought to you by Sakib Sami
