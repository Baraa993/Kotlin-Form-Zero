/**
 * Created by Baraa AbdAlhafiz on 9/18/2017.
 */


fun main(args: Array<String>) {

    var index = "Welcome To My App"
    println(index)
    // To Print Every Single Letter on its own
    for (i in 0..index.length-1){
        println("index[$i] : "+ index[i])
    }

    var name:String = readLine()!!.toString()
    var msg = index +" "+ name
    println(msg)
    // To Make Every Letter Is Small
    println(msg.toLowerCase())
    // To Make Every Letter Is Capital
    println(msg.toUpperCase())
    // Get More Spaces In Text
    println(index.trim())
    // Split text by The Things That You Want
    println(msg.split(" "))


}