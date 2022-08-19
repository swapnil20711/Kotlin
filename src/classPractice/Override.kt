package classPractice

fun main() {
    var phone: OnePlus = OnePlus("SmartPhone")
    phone.display()
    println(phone.name)
    println(phone.type)
    phone.findRatings(1, 2, 4, 5, 2)
    println(phone)
}

open class Mobile(val type: String) {
    open val name: String = ""
    open val screenSize = 5
    open fun display() = println("Mobile display called")
    fun powerOff() = println("Mobile power off")
}

class OnePlus(typeParam:String) : Mobile(typeParam) {
    override val name: String = "One plus"
    override val screenSize: Int = 6

    /*
    * Method being overriden to change the functionality
    * */
    override fun display() {
        super.display()
        println("One plus display called")
    }



    /*
    * vararg is like int... of java it passes list of arguments
    * */
    fun findRatings(vararg ratings: Int) {
        var sum = 0
        for (rate in ratings) {
            sum += rate
        }
        println(sum / ratings.size.toFloat())
    }

    override fun toString(): String {
        return "OnePlus(name='$name', screenSize=$screenSize)"
    }

}