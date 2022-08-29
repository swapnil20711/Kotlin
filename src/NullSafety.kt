fun main() {
    val gender: String = "Male"
    val gender2: String? = null

    println(gender2?.toUpperCase())
    gender2?.let {
        println("Line 1")
        println("Line 2")
        println("Line 3 $gender2")
    }
    /*Elvis operator*/
    var selectedValue = gender2 ?: "NA"
    println(selectedValue)

/*    var value= gender2!!.toUpperCase()
    println(value)*/
}