fun main() {
    val p1 = PersonDC("swap0", 21)
    val p2 = PersonDC("swap0", 21)
    println(p1 == p2)
    println(p1)
    println(p2)
    val p3 = p1.copy(age = 23)
    println(p3)
    /*
    * Destructing*/
    val (name, age) = p3
    println("Name is $name and Age is $age")

    println(p1.component1())
}

data class PersonDC(val name: String, val age: Int)