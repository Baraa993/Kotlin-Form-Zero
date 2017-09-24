/**
 * Created by Baraa AbdAlhafiz on 9/16/2017.
 */


fun main(args:Array<String>){

    println("Enter Your Name:")
    //To Get Data From User
    var firstName:String = readLine()!!
    println("Your name: "+firstName)

    //If Not String We Should Define The Type Of Input
    //Using (.toInt()) If The Input Is Integer
    println("Enter Your Age:")
    val age:Int = readLine()!!.toInt()
    println("Age: "+age)

    println("Enter Your Department:")
    val department = readLine()
    println("Studied: "+department)

    //If Not String We Should Define The Type Of Input
    //Using (.toDouble()) If The Input Is Double
    println("Enter Your Avg:")
    val avg:Double = readLine()!!.toDouble()
    println("Average: "+avg)

    println("Enter Your Job:")
    var title:String?=null
    println(title)
    title = readLine()
    println("Job: "+title)

}