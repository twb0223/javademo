package builderpattern

import java.util.ArrayList

class Meal {
    private val items = ArrayList<Item>()

    val cost: Float
        get() {
            var cost = 0.0f
            for (item in items) {
                cost += item.price()
            }
            return cost
        }

    fun addItem(item: Item) {
        items.add(item)
    }

    fun showItmes() {
        for (item in items) {
            print("Item : " + item.name())
            print(", Packing : " + item.packing().pack())
            println(", Price : " + item.price())
        }
    }

}

