/**
 * Created by Baraa AbdAlhafiz on 9/18/2017.
 */


fun main(args: Array<String>) {

    // We Use (break) To Stop Executing If The Condition Is True
    for (count in 1..10) {
        //Block Of Code
        println("Count = $count")
        if (count == 7) {
            break
        }
    }
    println("End Break App\n")


    // We Use (continue) To Jump Of One loop When Executing
    for (count in 1..10) {
        //Block Of Code
        if (count == 5) {
            continue
        }
        println("Count = $count")
    }
    println("End Continue App\n")


    // We Use Labeling  To Mark Which Of loop We Want Execute The Condition
    loop@ for (count in 1..10) {
        //Block Of Code
        for (count2 in 1..3) {
            println("Count = $count")
            if (count == 5) {
                break@loop
            }
        }

    }
    println("End Labeling App")


}