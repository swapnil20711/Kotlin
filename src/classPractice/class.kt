fun main() {
/*    val person = Person("swap", 5)
    println(person.age)
    println(person.name)*/

    var car = Car("swap", "petrol")
    println(car.seatCount)
    println(car.wheelsCount)
    println(car.name)
}

/*
* Constructor with properties*/
/*class Person(val name: String, val age: Int) {

}*/

/*
* Primary constructor
* */
class Car(val wheelsCount: Int, val seatCount: Int, nameParam: String, typeParam: String) {
    val name = nameParam
    val type = typeParam

    /*
    * Secondary constructor
    * */
    constructor(nameParam: String, typeParam: String) : this(wheelsCount = 4, seatCount = 5, nameParam, typeParam)
}