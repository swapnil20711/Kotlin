fun main(){
    //Use of Arithmetic Operators in kotlin
    val num1=12.5
    val num2=3.5
    var result:Double
    result=num1+num2
    println("num1+num2 = $result")
    println("${num1.plus(num2)}")
    result=num1-num2
    println("num1-num2 = $result")
    println(num1.minus(num2))
    result=num1*num2
    println("num1*num2 = $result")
    println(num1.times(num2))
    result=num1/num2
    println("num1/num2 = $result")
    println(num1.div(num2))
    result=num1%num2
    println("num1%num2 = $result")
    println(num1.mod(num2))
}