fun main() {
    println(add(1, 12))
    println(printMessage(1))
    isEven(5)
}

/*Default value of count is 2
* */
fun printMessage(count: Int = 2) {
    for (i in 1..count) {
        println("Hello world $i")
    }
}

/*
* Inline functions in kotlin
* */
fun add(num1: Int, num2: Int) = num1 + num2

fun isEven(numberToCheck: Int) {
    val result = if (numberToCheck % 2 == 0) "Even" else "Odd"
    println(result)
}