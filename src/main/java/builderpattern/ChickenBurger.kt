package builderpattern

class ChickenBurger : Burger() {

    override fun price(): Float {
        return 50.5f
    }

    override fun name(): String {
        return "Chicken Burger"
    }
}

