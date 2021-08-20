package collections

fun main() {
    /*
    * Logic to select specific word from a list starting with a letter and shuffle them.
    * */
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    var filteredList = words.filter {
        it.startsWith('c', ignoreCase = true)
    }.shuffled().take(2).sorted()
    println(filteredList)

}