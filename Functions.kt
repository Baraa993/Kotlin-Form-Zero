/**
 * Created by Baraa AbdAlhafiz on 9/19/2017.
 */


fun main(args: Array<String>) {

    show(10)
    show(50)
    show(100)
    var sumResult = sum(1.0,5.0)
    println(sumResult)
    sumResult = sum(12.5,5.3)
    println(sumResult)

}

fun show(number:Int){
    println("The Number Is $number")
}
// We But (:Double) Before Curly Brackets Because We Need To Return Data
fun sum(number1:Double,number2:Double):Double{
    val sumVal = number1+number2
    return sumVal
}