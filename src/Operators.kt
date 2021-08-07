import kotlin.math.sign

fun main() {
    //Use of Arithmetic Operators in kotlin
    val num1 = 12.5
    val num2 = 3.5
    var result: Double
    result = num1 + num2
    println("num1+num2 = $result")
    println("${num1.plus(num2)}")
    result = num1 - num2
    println("num1-num2 = $result")
    println(num1.minus(num2))
    result = num1 * num2
    println("num1*num2 = $result")
    println(num1.times(num2))
    result = num1 / num2
    println("num1/num2 = $result")
    println(num1.div(num2))
    result = num1 % num2
    println("num1%num2 = $result")
    println(num1.mod(num2))

    /*
    * Assignment operators
    * */
    var number = 12
    number *= 5
    println(number)

    /*
    * Unary operators
    * */
    println(+number)
    println(-number)
    println(++number)
    println(--number)

    /*
    * Comparison and equality operators
    * */
    val max = if (num1 > num2)
        num1
    else
        num2
    println("Max of num1 and num2 is $max")

    /*
    * Logical operators
    * */
    println((num1 > num2) && (number > num1))

    /*In operator
    * */
    val numbers = intArrayOf(1, 4, 50, 51)
    if (4 in numbers)
        println("4 is present in the array.")
    else
        println("Oops it's not in the array")

}