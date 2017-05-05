package ninja.sakib.kotlinschool.examples

import com.eclipsesource.json.Json
import com.eclipsesource.json.JsonArray
import com.eclipsesource.json.JsonObject

/**
 * := Coded with love by Sakib Sami on 5/5/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

fun main(args: Array<String>) {
    init()
}

fun init() {
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

    val jsonObj = Json.parse(jsonText) as JsonObject
    println(jsonObj.getString("name", "Unknown"))
    println(jsonObj.getInt("age", 0))

    val emails = jsonObj.get("emails").asArray()
    for ((index, email) in emails.withIndex()) {
        println("${index + 1}. ${email.asString()}")
    }

    val address = jsonObj.get("address") as JsonObject
    println(address.getInt("house", 0))
    println(address.getInt("road", 0))


    val myAddress = JsonObject()
            .add("house", 30)
            .add("road", 7)

    val myEmails = JsonArray()
    myEmails.add("s4kibs4mi@gmail.com")
    myEmails.add("sakib@nybsys.com")

    val myJson = JsonObject()
            .add("name", "Sakib Sami")
            .add("age", 23)
            .add("emails", emails)
            .add("address", myAddress)
    println(myJson)
}
