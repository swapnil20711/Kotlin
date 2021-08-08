package classPractice

fun main() {
    val squareCabin: SquareCabin = SquareCabin(4, "wood", 5)
    with(squareCabin){
        println("Capacity is $capacity")
        println("Building Material is $buildingMaterial")
        println("Has room?= ${hasRoom()}")
    }
}