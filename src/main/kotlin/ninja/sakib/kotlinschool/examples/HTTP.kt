package ninja.sakib.kotlinschool.examples

import khttp.extensions.fileLike
import khttp.get
import khttp.post
import org.json.JSONObject
import java.io.File

/**
 * := Coded with love by Sakib Sami on 5/6/17.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

fun main(args: Array<String>) {
    val params = mapOf("page" to 2.toString())
    val response = get("https://reqres.in/api/users", params = params)
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

    val files = listOf(File("file_name_with_path.extension").fileLike())
    val reqPost = post("url_here", files = files)
}
