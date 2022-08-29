fun main() {
    val fn = ::sum
    println(fn(3.4, 4.4))
    calculator(3.0, 5.0) { a, b ->
        a + b
    }

    val lambda = { a: Int, b: Int ->
        a + b
    }
    println(lambda(4, 5))

    val multiLineLambda = {
        println("Hello world")
        2
    }
    println(multiLineLambda())
    val singleLambda: (Int) -> Int = { x -> x * x }
    val simplifySingleLambda: (Int) -> Int = {
        it * it
    }
    println(simplifySingleLambda(5))
}

private fun sum(a: Double, b: Double): Double {
    return a + b
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {
    val result = gn(a, b)
    println(result)
}