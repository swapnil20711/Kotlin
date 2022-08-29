fun main() {
    val iContainer = Container<Int>(5)
    println(iContainer.getValue())
    val sContainer = Container<String>("Hello")
    println(sContainer.getValue())

    sum(1,2,3,4,5)
}

class Container<T>(var data: T) {
    fun getValue(): T {
        return data;
    }

    fun setValue(value: T) {
        data = value
    }
}

private fun sum(vararg values: Int) {
    var sum = 0
    for (i in values){
        sum+=i
    }
    println("Sum of values is $sum")
}