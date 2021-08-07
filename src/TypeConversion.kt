fun main() {
    val i: Int = 55
    val l: Long = i.toLong()
    println(l)

    /*
    * Expressions in kotlin
    * */
    val a = 12
    val b = 15
    val max = if (a > b) {
        println("If block is executing...")
        a
    }
    else {
        println("Else block is executing...")
        b
    }
    println("$max")
}