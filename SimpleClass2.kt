import java.security.acl.Owner

/**
 * Created by Baraa AbdAlhafiz on 9/20/2017.
 */


class Car1{

    var Type:String?=null
    var Model:Int?=null
    var Price:Double?=null
    var Owner:String?=null
    var Milles:Int?=null

    constructor(Type:String , Model:Int , Price:Double , Owner:String , Milles:Int){
        println("Type : $Type")
        this.Type=Type
        println("Model : $Model")
        this.Model=Model
        println("Price : $Price")
        this.Price=Price
        println("Owner : $Owner")
        this.Owner=Owner
        println("Milles : $Milles")
        this.Milles=Milles
    }
    fun GetPrice():Double{
        return this.Price!!-(this.Milles!!.toDouble()*10)
    }
    fun GetOwner():String{
        return this.Owner!!
    }
}

fun main(args: Array<String>) {

    var car1 = Car1("BMW",1988,3750.0,"Baraa",35)
    println("Currently Price : "+car1.GetPrice())
    println("Owner : "+car1.GetOwner()+"\n")
    var car2 = Car1("Hyundai",2005,6300.0,"Ismail",27)
    println("Currently Price : "+car2.GetPrice())
    println("Owner : "+car2.GetOwner()+"\n")
}