/**
 * Created by Baraa AbdAlhafiz on 9/16/2017.
 */

/*

 Order of Operations | math priorities
1.Parentheses ()
2.Exponents ^
3.Multiplication  * and Division /(from left to right)
4.Addition + and Subtraction - (from left to right)
5.Equal =

 */
fun main(args: Array<String>) {

    val number1 = 10
    val number2 = 20
    val number3 = 5
    var sum:Int?=null

    sum = number1 + number2 * number3 - 3
    println("Sum1 = $sum")

    sum = (number1 + number2) * number3 - 3
    println("Sum2 = $sum")

    sum = number1 + number2 / number3
    println("Sum3 = $sum")

}