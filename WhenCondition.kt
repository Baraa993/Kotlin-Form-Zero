/**
 * Created by Baraa AbdAlhafiz on 9/17/2017.
 */


fun main(args: Array<String>) {

    println("Enter The Number :")
    var number:Int = readLine()!!.toInt()

    when(number){
        1->{
            println("You Enter Number : 1")
        }
        2->{
            println("You Enter Number : 2")
        }
        3,4->{
            println("You Enter Number : 3 Or 4")
        }
        in 10..30->{
            println("You Enter Number Between 10 to 30")
        }
        !in 10..30->{
            println("You Enter Number Not Between 10 to 30")
        }else->{
        println("Out Of Range")
        }

    }

}