/**
 * Created by Baraa AbdAlhafiz on 9/23/2017.
 */


class Outer1 {

    var name:String = "Baraa"

    inner class Inner {

        fun getMsg():String{
            return "Welcom To Kotlin"
        }
        fun getName():String{
            return name
        }

    }
}

fun main(args: Array<String>) {



}