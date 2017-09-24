/**
 * Created by Baraa AbdAlhafiz on 9/18/2017.
 */


fun main(args: Array<String>) {

    var arrayint=Array<String>(5){""}
    for (index in 0..4){
        println("Please Enter The Names")
        arrayint[index]= readLine()!!.toString()
    }
    println("List Of The Element")
    for (i in arrayint){
        println(i)
    }

}