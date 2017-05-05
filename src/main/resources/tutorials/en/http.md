# Kotlin School

### HTTP

Playing with [khttp](https://github.com/jkcclemens/khttp)

#### Integrating

Gradle,
```
repositories {
    maven { url 'https://jitpack.io' }
}
```
```
compile 'com.github.jkcclemens:khttp:0.1.0'
```

Maven,
```
<repositories>
    <repository>
	    <id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```
```
<dependency>
    <groupId>com.github.jkcclemens</groupId>
	<artifactId>khttp</artifactId>
	<version>0.1.0</version>
</dependency>
```

Impressive code,
```kotlin
val params = mapOf("page" to 2.toString())  // Parameters
val response = get("https://reqres.in/api/users", params = params)  // Send get request
val resultAsJson = response.jsonObject

for ((key, value) in response.headers) {
    println("$key == $value")
}

println(resultAsJson.getInt("per_page"))
println(resultAsJson.getInt("total"))

val data = resultAsJson.getJSONArray("data")
for (it in data) {
    println(it)
}

for (it in data) {
    val obj = it as JSONObject
    println(obj.getString("first_name"))
    println(obj.getString("last_name"))
    println(obj.getString("avatar"))
    println(obj.getInt("id"))
}

// Multipart file parameters
val files = listOf(File("file_name_with_path.extension").fileLike())
val reqPost = post("url_here", files = files)   // Sending multipart request
```

`params` are the parameters which will be attached to request.
For `get` method like ?key=value&key2=value2.....
It will take care of processing for other methods too.
Too easy, isn't it ? ;)

You can convert body directly to json body. Oh got rid of shitty stuffs used to do !!!

[Go Back](https://github.com/s4kibs4mi/KotlinSchool/blob/master/src/main/resources/tutorials/en/index.md)
###### Brought to you by Sakib Sami
