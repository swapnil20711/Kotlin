fun main(){
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests:Int=0
    var index:Int=0
    while (index<guestsPerFamily.size){
        totalGuests+=guestsPerFamily[index]
        index++
    }
    println("Totals guests are: $totalGuests")
    totalGuests=0
    for (number in guestsPerFamily){
        totalGuests+=number
    }
    println("Totals guests are: $totalGuests")
    for (alphabet in 'b'..'z'){
        print("$alphabet")
    }
    println()
    for(number in 5 downTo 1){
        print("$number")
    }
    println()
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names){
        println("$name -Number of characters: ${name.length}")
    }
}