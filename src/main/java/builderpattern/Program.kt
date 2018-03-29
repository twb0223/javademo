package builderpattern

object Program {
    @JvmStatic
    fun main(args: Array<String>) {
        val mealBuilder = MealBuilder()
        val vegmeal = mealBuilder.prepareVegMeal()
        vegmeal.showItmes()
        println("VegMeal Cost:" + vegmeal.cost)

        val nonvegmeal = mealBuilder.prepareNonVegMeal()
        nonvegmeal.showItmes()

        println("nonVegMeal Cost:" + nonvegmeal.cost)

    }
}