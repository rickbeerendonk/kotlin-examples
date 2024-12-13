// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

class Demo(val name: String) {
    private val list = mutableListOf<Demo>()

    fun add(demo: Demo) {
        list.add(demo)
    }

    override fun toString() = "$name contains ${list.size} demos."
}

// - No variable needed
// - Extension method
// - this refers to scope object
// - return = context (Demo)
val result = Demo("First").apply {
    add(Demo("one"))
    add(Demo("two"))
    println(this)  // First contains 2 demos.
    // return value NOT needed
}

println(result)  // First contains 2 demos.
