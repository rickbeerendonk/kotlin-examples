// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

class Product(val name: String) {
    val id: Int;

    init {
        this.id = Product.nextId()
    }

    companion object {
        private var id = 0
        fun nextId(): Int {
            return ++id
        }
    }
}

val p1 = Product("Shoes")
println("${p1.id}. ${p1.name}")

val p2 = Product("Umbrella")
println("${p2.id}. ${p2.name}")
