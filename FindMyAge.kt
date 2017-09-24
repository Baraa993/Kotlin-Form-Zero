import java.util.*

/**
 * Created by Baraa AbdAlhafiz on 9/16/2017.
 */


fun main(args: Array<String>) {

    //Input
    println("Enter You Birthday Day : ")
    var dayOfBirth:Int = readLine()!!.toInt()
    println("Enter You Birthday Month : ")
    var monthOfBirth:Int = readLine()!!.toInt()
    println("Enter You Birthday Year : ")
    var yearOfBirth:Int = readLine()!!.toInt()

    //Process
    var day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    var month = Calendar.getInstance().get(Calendar.MONTH)
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var dayOfMonth = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    var ageYear = year - yearOfBirth
    var dayYear = day + (dayOfBirth  - dayOfMonth)
    var monthYear = month - monthOfBirth


    //Output
    println("Your Age Is : $ageYear Year and $monthYear Month and $dayYear Days ")

}