/**
 * Created by Baraa AbdAlhafiz on 9/23/2017.
 */


class thread() :Thread(){
    var ThreadName:String= ""

    constructor(ThreadName:String):this(){
        this.ThreadName=ThreadName
        println(this.ThreadName+ " is started")
    }
    override  fun   run(){
        //Write Thread
        var count=0
        while (count<10){
            println(this.ThreadName+" Count:$count")
            count++

            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                print(ex.message)
            }
        }
    }

}
fun main(args:Array<String>){

    println("Thread is running")

    var t1= thread("Thread1")
    t1.start()

    var t2= thread("Thread2")
    t2.start()

    var t3= thread("Thread3")
    t3.start()
    t3.join()

}


