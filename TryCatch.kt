/**
 * Created by Baraa AbdAlhafiz on 9/23/2017.
 */


fun main(args: Array<String>) {

    val number1 = 20
    val number2 = 15
    val number3 = 0

    val sum = number1+number2+number3
    println("Sum = $sum")

    val sub = number1-number2-number3
    println("Sub = $sub")

    try {
        val div= number1/number2/number3
        println("Div = $div")
    }catch (ex:Exception){
        println(ex.message)
    }

    val mul = number1*number2*number3
    println("Mul = $mul")

}