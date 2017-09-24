/**
 * Created by Baraa AbdAlhafiz on 9/17/2017.
 */


fun main(args: Array<String>) {

    println("Enter Your Grade :")
    var grade:Double = readLine()!!.toDouble()

    if (grade>=50){
        //Block Of Code
        grade=grade+10
        println("You Pass Exam")
        println("You Get 10 Grades More Your New Grade Is : $grade")
    } else {
        //Block Of Code
        if (grade>=45){
            grade=grade+5
            println("You Get 5 Grades More To Pass , Your Grade Is : $grade")
        }else{
            println("You Fail")
        }

    }

    println("End App")

}