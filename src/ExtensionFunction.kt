fun main() {
    println("Hello world".formattedString())
    calculateTimeToRun {
        loop(100000000)
    }
}

fun String.formattedString(): String {
    return "-------------\n$this\n-------------"
}

fun loop(n: Long) {
    for (i in 1..n) {

    }
}

fun calculateTimeToRun(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken in ms is ${end - start}")
}