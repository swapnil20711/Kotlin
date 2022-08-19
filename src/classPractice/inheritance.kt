package classPractice

fun main() {
    val childObj = Child()
    childObj.name = "test"
    println(childObj.childDetails())
}

open class Parent() {
    var name: String = "swap"
    var age: Int = 1

    init {
        println("In parent's class")
        personDetails()
    }

    private fun personDetails() {
        println("$name $age")
    }
}

/*
* Cannot inherit multiple classes
* */
class Child() : Parent() {
    init {
        println("In child's class")
    }

    fun childDetails() {
        println("$name $age")
    }
}
