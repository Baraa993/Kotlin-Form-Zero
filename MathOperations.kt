/**
 * Created by Baraa AbdAlhafiz on 9/16/2017.
 */


fun main(args: Array<String>) {

    println("Calculator")

    println("Enter number1")
    var number1:Double = readLine()!!.toDouble()
    println("Enter number2")
    var number2:Double = readLine()!!.toDouble()

    //Print The Result With His Name
    var sum:Double = number1 + number2
    println("Sum = "+sum)

    //Another Way to Print The Result With His Name
    var min:Double = number1 - number2
    println("Min = $min")
}