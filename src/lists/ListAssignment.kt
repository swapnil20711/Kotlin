import lists.Order

open class Item(val name: String, val price: Int) {
    override fun toString(): String {
        return name
    }
}

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
}

class Vegetables(private vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        return if (toppings.isEmpty()) {
            "$name CHEF'S CHOICE"
        } else {
            name + " " + toppings.joinToString()
        }
    }
}


fun main() {
    val ordersList = mutableListOf<Order>()
    val noodles = Noodles()
    val vegetables = Vegetables("Cabbage", "Onion", "Sprouts")


    val order = Order(1)
    order.addItem(Item("Banana", 15))
    order.addItem(noodles)
    order.addItem(vegetables)

    val order1 = Order(2)
    order1.addItem(Noodles())
    order1.addItem(Vegetables())

    ordersList.add(order)
    ordersList.add(order1)

    /*
    * Add order directly
    * */
    ordersList.add(
            Order(3)
                    .addItem(Noodles())
                    .addItem(Noodles())
                    .addItem(Vegetables("Spinach")))
    /*
    * Print each order
    * */
    for (order in ordersList) {
        order.print()
    }

}