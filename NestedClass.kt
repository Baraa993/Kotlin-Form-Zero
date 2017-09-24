/**
 * Created by Baraa AbdAlhafiz on 9/23/2017.
 */


class Outer {

    var name:String = "Baraa"

    class Inner {

        fun getMsg():String{
            return "Welcom To Kotlin"
        }

    }
}

fun main(args: Array<String>) {

    var out = Outer()
    var inner = Outer.Inner()
    println(inner.getMsg()+ " " + name)

}