/**
 * Created by Baraa AbdAlhafiz on 9/15/2017.
 */


fun main(args:Array<String>){

    // Value Cannot Change
    val firstName = "Baraa"
    print("Your name: "+firstName)

    // Variable can Change
    // Variable printed Then Change
    var lastName = "Alhafiz"
    println(lastName)
    lastName = "Abd-Alhafiz"
    println(lastName)

    val age:Int = 24
    println("Age: "+age)

    val department = "Computer Science"
    println("Studied: "+department)

    val avg:Double = 72.9
    println("Average: "+avg)

    // Variable Changed before Print
    var title:String?=null
    // using (var title:String?=null) if The User Let The Variable Is Null
    println(title)
    title = "Develover"
    title = "Developer"
    println("Job: "+title)
}