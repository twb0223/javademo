package builderpattern

class Coke : ColdDrink() {

    override fun price(): Float {
        return 30.0f
    }

    override fun name(): String {
        return "Coke"
    }
}

