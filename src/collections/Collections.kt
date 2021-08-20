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
    /*
    * Maps in kotlin*/
    val peopleAges = mutableMapOf<String, Int>(
            "swapnil" to 21,
            "testing" to 51
    )
    /*
    * If you put one value two times then the first value gets updated in map*/
    peopleAges["new"] = 11
    peopleAges["new"] = 16
    println(peopleAges)
    /*For each looping to print key and value using iterator
    * */
    peopleAges.forEach {
        println("key= ${it.key}, value= ${it.value}")
    }
    /*
    * This method is used to filter ages where key length is less than 7*/
    val filteredNames = peopleAges.filter {
        it.key.length < 7
    }
    println(filteredNames)
    /*
    * Lambda function in kotlin.*/
    val triple: (Int) -> Int = { it * 3 }
    println(triple(8))

    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
}
