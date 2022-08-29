fun main() {
    val day = Day.SATURDAY
    println(day)
    println(day.number)
    for (day in Day.values()) {
        println(day)
    }
    day.printFormattedDay()

    val points = when (val tile: Tile = Red("fire", 25)) {
        is Blue -> tile.points * 3
        is Red -> tile.points * 2
    }
    println(points)
}

enum class Day(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay() {
        println("Day is $this")
    }
}

sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()