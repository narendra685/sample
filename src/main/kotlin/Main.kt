import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
 import io.ktor.http.*
import io.ktor.server.plugins.contentnegotiation.*
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.json.JSONObject

suspend  fun main(args: Array<String>) {
      println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("hello")
    var client= HttpClient(CIO)
     var res=client.get("http://127.1.0.0:8080/mod1"){
         headers{
             append("name","header")
         }
         basicAuth("yo","yo")
     }
    runBlocking {
        var req = async {
            client.get("https://ppapi.tatadigital.com/api/v1/tatacliqcrm/cliqOrderHistory?channel=web¤tPage=0&isMDE=true")  {
                headers {
                    append(HttpHeaders.Authorization, "Q1RjYVNkSXdHRWJ0YWxBcHBwbmlqbQ==")
                    append("client_id", "CS-WEB-APP")
                    append("actualCustHash", "f81cfe57dfa3027401ee9999f220ef7e")
                }


            }.body<String>()


        }

        var req1=async { client.request("http://0.0.0.0:8080/allData"){
            method=HttpMethod.Post
            headers{
                append("auth","yoyo")
            }
        }.body<String>()
        }
        val firstRequestContent = req.await()
        val secondRequest=req1.await()
        println(firstRequestContent)
        println("data is".plus(secondRequest))
    }

                 // var jsonResp=JSONObject(req.body<String>())
   // println(jsonResp.getJSONArray("orderData"))

        //  println(jsonResp)
    print(res.status)



}