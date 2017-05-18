# Kotlin School

### Database

#### 1. Sqlite

For embedded database like Sqlite we are going to use [PultusORM](https://github.com/s4kibs4mi/PultusORM).
Using [PultusORM](https://github.com/s4kibs4mi/PultusORM) is extremely easy & compatible with Android.
Lets have a look how to use.

Integrating using gradle,
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}

dependencies {
    compile 'ninja.sakib:PultusORM:v1.4'
}
```

Show me the code,

First define a class to use,

```kotlin
class Location {
    @PrimaryKey
    var locationId = 0
    var latitude: Double = 0
    var longitude: Double = 0
}

var pultusORM = PultusORM("dbname", "dbPath")

var location = Location()
location.latitude = 28.28
location.longitude = 90.90
pultusORM.save(location)
```

Finding Data,
```kotlin
var pultusORM = PultusORM("dbname", "dbPath")
for(it in pultusORM.find(Location())){
    val location = it as Location
    println(location.latitude)
    println(location.longitude)
}
```

You will get more example on [project's site](https://github.com/s4kibs4mi/PultusORM).

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
