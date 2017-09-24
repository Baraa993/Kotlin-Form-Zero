/**
 * Created by Baraa AbdAlhafiz on 9/18/2017.
 */


fun main(args: Array<String>) {

   var arrayint=Array<Int>(5){0}
    arrayint[2]=5
    for (index in 0..4){
        println(arrayint[index])
    }

    // Another Why To Print Elements Of Array
    var array=Array<Int>(5){1}
    for (i in array){
        println(array[i])
    }

}