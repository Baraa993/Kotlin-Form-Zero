/**
 * Created by Baraa AbdAlhafiz on 9/19/2017.
 */


// Public Variable
// Can Use In Multi Methods
var name="Baraa"

fun main(args: Array<String>) {

    println(name)
    show()
}

fun show(){
    // Private  Variable
    // Can't Use In Multi Methods
    var age = 24
    println(name)
    println(age)
}