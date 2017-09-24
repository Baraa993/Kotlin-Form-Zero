/**
 * Created by Baraa AbdAlhafiz on 9/17/2017.
 */


fun main(args: Array<String>) {

    println("Enter Your Grade :")
    var grade:Double = readLine()!!.toDouble()

    if (grade>= 90){
        println("A")
    }else if (grade>=80 && grade<90){
        println("B")
    }else if (grade>=70 && grade<80){
        println("c")
    }else if (grade>=60 && grade<70){
        println("D")
    }else if (grade>=50 && grade<60){
        println("E")
    }else{
        print("You Fail")
    }

    println("End App")
}