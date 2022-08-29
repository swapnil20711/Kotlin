fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    println(list.filter { it ->
        it % 2 == 0
    })
    val listOfSquare=list.map {
        it*it
    }
    listOfSquare.forEach{
        print("$it ")
    }
}