package builderpattern

class VegBurger : Burger() {
    override fun name(): String {
        return "VegBurger"
    }

    override fun price(): Float {
        return 25.0f
    }
}

