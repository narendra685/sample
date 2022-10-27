package pack2

import A
import B
import java.io.*
import java.util.Properties

class C:B(){

    public override fun getData(){
        println("c is called")
    }

public fun getFileData(){
     var input:InputStream = FileInputStream("D:\\Ktor-client\\gradle.properties")
var pr=Properties()
    pr.load(input)
println(pr.getProperty("dbname"))
 }
}

fun main(){
    var ob1=C()
    ob1.getData()
    ob1.getFileData()

}