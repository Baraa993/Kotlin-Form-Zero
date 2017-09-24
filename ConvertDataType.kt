/**
 * Created by Baraa AbdAlhafiz on 9/16/2017.
 */


fun main(args:Array<String>){

    //Convert From String To Integer
    var strInt:String = "1234"
    println(strInt)
    var intStr:Int = strInt.toInt()
    println(intStr)

    //Convert From String To Double
    var strDouble:String = "12.34"
    println(strDouble)
    var doubleStr:Double = strDouble.toDouble()
    println(doubleStr)

    //Convert From Double To Integer
    var doubleInt = 45.67
    println(doubleInt)
    var intDouble:Int = doubleInt.toInt()
    println(intDouble)

}