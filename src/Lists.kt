fun main() {
    val numbers: List<Int> = listOf(12, 2, 3, 4, 5, 45)
    println("List: $numbers")
    println("Size: ${numbers.size}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")
    println("Sorted List: ${numbers.sorted()}")

    val entrees: MutableList<String> = mutableListOf()
    println("Entrees :$entrees")
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees :$entrees")
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add List: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

}