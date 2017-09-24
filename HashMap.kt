/**
 * Created by Baraa AbdAlhafiz on 9/19/2017.
 */


fun main(args: Array<String>) {

    var map = HashMap<Int,String>()
    map.put(1,"Ismail")
    map.put(2,"Hanan")
    map.put(3,"Baraa")
    map.put(5,"Anas")
    map.put(6,"Mohammed")
    map.put(4,"Rghad")
    map.put(7,"Bissan")

    // To Update Data By Take The Same Key
    map.put(6,"Mohammad")
    // Print Data By key Given
    println(map.get(1))
    // Another why to Print Data By key Given
    println(map[6])
    println("")

    // Another why to Print Data
    for (key in map.keys){
        println(map[key])
    }


}