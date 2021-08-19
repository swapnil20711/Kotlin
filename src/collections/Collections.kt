package collections

fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    // Normally prints the list.
    println("list:   $numbers")
    // Sorts the list in ascending order.
    println("sorted list: ${numbers.sorted()}")
    // Converts the list into set and prints it.
    val numbersSet = numbers.toSet()
    println("set: $numbersSet")
    /*
    Even though both set might seem different but this statement will print true as both contains same elements and
    mutable or immutable does not matter at time when condition is checked
     */
    val set = setOf(1, 1, 2, 3)
    val setToCompare = mutableSetOf(1, 2, 3)
    println("$set==$setToCompare returns ${set == setToCompare}")
    println("contains 7: ${set.contains(7)}")
}
