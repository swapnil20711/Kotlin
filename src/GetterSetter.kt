fun main() {
    val p = Person("swap", 21)
    println(p.name)
    println(p.age)
    p.age = -1
    println(p.name)
}

class Calculator {
    lateinit var message: String
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

class Person(nameParam: String, ageParam: Int) {
    var name = nameParam
        //Getter to get value
        get() {
            return field.toUpperCase()
        }
    var age = ageParam
        //Setter to set value
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age cannot be neagtive")
            }
        }
}