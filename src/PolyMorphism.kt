fun main() {
    /*
    * Polymorphism*/
    val shapeCircle: Shape = Circle(5.0)
    val shapeSquare: Shape = Square(5.0)
    val shapeTriangle: Shape = Triangle(5.0, 10.0)
    val list = arrayListOf<Shape>(shapeSquare, shapeCircle, shapeTriangle)
    calculateAreas(list)
}

fun calculateAreas(list: List<Shape>) {
    for (shape in list) {
        println(shape.area())
    }
}

open class Shape() {
    open fun area(): Double {
        return 0.0
    }
}

open class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return "%.2f".format(Math.PI * radius * radius).toDouble()
    }
}

open class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

open class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}