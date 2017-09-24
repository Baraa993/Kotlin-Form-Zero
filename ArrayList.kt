/**
 * Created by Baraa AbdAlhafiz on 9/19/2017.
 */


fun main(args: Array<String>) {

    var arrayList = ArrayList<String>()
    arrayList.add("Baraa")
    arrayList.add("Ismail")
    arrayList.add("Suliman")
    arrayList.add("Mohammed")
    arrayList.add("Alhafiz")
    // To Update Data Where You Chose
    arrayList.set(3,"Mohammad")
    // Another Way To Update Data sWhere You Chose
    arrayList[4]="Abd-Alhafiz"

    for (i in arrayList){
        println(i)
    }
    // Another Why To Print
    for (x in 0..arrayList.size-1){
        println(arrayList[x])
    }
    for (j in arrayList){
        println(arrayList)
    }

    // To Find A Name
    println("Search Name")
    var searchName = readLine()!!.toString()
    if (arrayList.contains(searchName)){
        println("Name Is Found")
    }else{
        println("Name Is Not Found")
    }


}