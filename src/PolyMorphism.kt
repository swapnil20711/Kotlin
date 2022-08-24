fun main() {
    /*
    * Polymorphism*/
    val shapeCircle: Shape = Circle(5.0)
    val shapeSquare: Shape = Square(5.0)
    val shapeTriangle: Shape = Triangle(5.0, 10.0)
    val list = arrayListOf<Shape>(shapeSquare, shapeCircle, shapeTriangle)
    calculateAreas(list)
    dragObjects(list)
}

fun calculateAreas(list: List<Shape>) {
    for (shape in list) {
        println(shape.area())
    }
}

fun dragObjects(list: List<Draggable>) {
    for (obj in list) {
        obj.drag()
    }
}

abstract class Shape() : Draggable {
    /*
    * Child class will define it's property
    * */
    abstract fun area(): Double
}

open class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return "%.2f".format(Math.PI * radius * radius).toDouble()
    }

    override fun drag() {
        println("Circle is dragging")
    }
}

open class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }

    override fun drag() {
        println("Square is dragging")
    }
}

open class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() {
        println("Triangle is dragging")
    }
}

/*
* Group objects on basis of behaviour like dragging is common behaviour among classes here
* */
interface Draggable {
    fun drag()
}