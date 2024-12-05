// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

class Demo(val name: String) {
    private val list = mutableListOf<Demo>()

    fun add(demo: Demo) {
        list.add(demo)
    }

    override fun toString() = "$name contains ${list.size} demos."
}

// let():
// - No variable needed
// - Extension method
// - it refers to object
// - return = lambda return
val result = Demo("First").let {
    it.add(Demo("one"))
    it.add(Demo("two"))
    println(it)  // First contains 2 demos.
    it // return value
}

println(result)  // First contains 2 demos.
