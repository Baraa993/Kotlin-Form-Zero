/**
 * Created by Baraa AbdAlhafiz on 9/20/2017.
 */


open class Operation1{
    fun sum(number1:Double,number2:Double):Double{
        return number1+number2
    }
    open fun sub(number1:Double,number2:Double):Double{
        return number1-number2
    }

}
class MulOperation1():Operation1(){
    fun mul(number1:Double,number2:Double):Double{
        return number1*number2
    }
    fun div(number1:Double,number2:Double):Double{
        return number1/number2
    }
    override fun sub(number1:Double,number2:Double):Double{
        super.sub(number1, number2)
        return number1-number2+15
    }

}

fun main(args: Array<String>) {

    var op = Operation1()
    println(op.sum(12.0,5.7))
    println(op.sub(12.0,5.7))
    println("\n")

    var mulOp = MulOperation1()
    println(mulOp.sum(12.0,5.7))
    println(mulOp.sub(12.0,5.7))
    println(mulOp.mul(12.0,5.7))
    println(mulOp.div(12.0,5.7))


}