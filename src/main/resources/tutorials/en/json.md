# Kotlin School

### JSON

Lets play with JSON in Kotlin.
For that we will use [minimal-json](#) an open source json library written in Java.

#### Integrating with project,
* Maven
```xml
<dependency>
  <groupId>com.eclipsesource.minimal-json</groupId>
  <artifactId>minimal-json</artifactId>
  <version>0.9.4</version>
</dependency>
```
* Gradle
```
compile "com.eclipsesource.minimal-json:minimal-json:0.9.4"
```

#### Parsing,
```kotlin
// Assume its the json text we are going to parse
val jsonText = "" +
            "{" +
                "\"name\": \"Sakib Sami\"," +
                "\"age\": 23," +
                "\"emails\": [" +
                    "\"s4kibs4mi@gmail.com\"," +
                    "\"sakib@nybsys.com\"" +
                "]," +
                "\"address\": {" +
                    "\"house\": 30," +
                    "\"road\": 7" +
                "}" +
            "}"

// Parsing the complete json text
val jsonObj = Json.parse(jsonText) as JsonObject
println(jsonObj.getString("name", "Unknown"))   // Extracting String
println(jsonObj.getInt("age", 0))   // Extracting Int

val emails = jsonObj.get("emails").asArray()    // Extracting Array
for ((index, email) in emails.withIndex()) {
    println("${index + 1}. ${email.asString()}")    // Iterating through array
}

// Parsing nested json object which is address
val address = jsonObj.get("address") as JsonObject
println(address.getInt("house", 0))
println(address.getInt("road", 0))
```
Json.parse `parse` method can be used in two ways. One is parse from `String` & Another is parse from `Reader`.

#### Creating,
Now lets create the same json text,
```kotlin
// Creating address as Json Object
val myAddress = JsonObject()
        .add("house", 30)
        .add("road", 7)

// Creating emails as Json Array
val myEmails = JsonArray()
myEmails.add("s4kibs4mi@gmail.com")
myEmails.add("sakib@nybsys.com")

val myJson = JsonObject()
        .add("name", "Sakib Sami")
        .add("age", 23)
        .add("emails", emails)  // Adding Array
        .add("address", myAddress)  // Adding Object
println(myJson)
```

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
