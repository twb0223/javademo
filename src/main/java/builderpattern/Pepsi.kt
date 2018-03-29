package builderpattern

class Pepsi : ColdDrink() {

    override fun price(): Float {
        return 35.0f
    }

    override fun name(): String {
        return "Pepsi"
    }
}
