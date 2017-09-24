/**
 * Created by Baraa AbdAlhafiz on 9/20/2017.
 */


class Car(Type:String , Model:Int , Price:Double , Owner:String){
    init {
        println("Type : $Type")
        println("Model : $Model")
        println("Price : $Price")
        println("Owner : $Owner\n")
    }
}

fun main(args: Array<String>) {

    var car1 = Car("BMW",1988,3750.0,"Baraa")
    var car2 = Car("Hyundai",2005,6300.0,"Ismail")
}