package L3

import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.io.File


interface GitHubApi {


    @GET("/repos/{owner}/{repo}")
    fun getRepository(@Path("owner") user: String, @Path("repo") repo: String): Call<Repository>
}


fun main() {

    val gitHubApi = Retrofit.Builder().baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GitHubApi::class.java)

    val res = gitHubApi.getRepository("Jetbrains", "kotlin").execute()
    println(Gson().toJson(res.body()))

    if (res.body() == null) {
        println(res.message())
        return
    }

    val repo = res.body()


    File("kotlin.html").writeText(
        """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>${repo?.owner?.login} - ${repo?.name}</title>
        </head>
        <body>
            <h1><a href='${repo?.html_url}'>${repo?.owner?.login} - ${repo?.name}</a></h1>
            <p>${repo?.description}</p>
            <p>${repo?.stargazers_count}</p>
            <p>${repo?.forks_count}</p>
        </body>
        </html>
    """.trimIndent()
    )

    val readText = File("kotlin.html").readText()
    println(readText)


}