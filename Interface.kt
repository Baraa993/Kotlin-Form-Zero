/**
 * Created by Baraa AbdAlhafiz on 9/22/2017.
 */


interface op{
    fun sum(number1:Double,number2:Double)
    fun sub(number1:Double,number2:Double)
}
class UserOo:op{
    override fun sum(number1: Double, number2: Double) {
        println(number1+number2)
    }

    override fun sub(number1: Double, number2: Double) {
        println(number1-number2)
    }
}
class AadminOo:op{
    override fun sum(number1: Double, number2: Double) {
        println(number1+number2+10)
    }

    override fun sub(number1: Double, number2: Double) {
        println(number1-number2-10)
    }

}

fun main(args: Array<String>) {
    var user = UserOo()
    user.sum(12.0,10.0)
    user.sub(12.0,10.0)

    var admin = AadminOo()
    admin.sum(12.0,10.0)
    admin.sub(12.0,10.0)

    }