package lists

import Item

class Order(private val orderNo:Int) {
    private val items = mutableListOf<Item>()

    /*
    * Add item is being chained by returing this
    * */
    fun addItem(newItem: Item): Order {
        items.add(newItem)
        return this
    }
    fun addAll(newItems:List<Item>): Order {
        items.addAll(newItems)
        return this
    }
    fun print(){
        println("Order #${orderNo}")
        var total:Int=0
        for (item in items){
            println("${item}: $${item.price}")
            total+=item.price
        }
        println("Total: $${total}")
        println()
    }
}