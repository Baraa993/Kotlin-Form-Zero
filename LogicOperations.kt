/**
 * Created by Baraa AbdAlhafiz on 9/17/2017.
 */


fun main(args: Array<String>) {

    println("Enter The Number :")
    var number:Double = readLine()!!.toDouble()

    //AND gate
    print("In AND gate : ")
    println(number > 10 && number <100)

    //OR gate
    print("In OR gate : ")
    println(number > 10 || number <100)

    //NOT gate
    // we Use (!) To Deny
    var isMarried:Boolean = true
    println(!isMarried)

    //Multiple Gates
    println(
            (number>=10 && number<=100) ||
            (number>=50 && number<=80)
    )

}