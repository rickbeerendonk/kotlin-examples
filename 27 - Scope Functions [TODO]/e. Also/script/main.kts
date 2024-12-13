// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

class Demo(val name: String) {
    private val list = mutableListOf<Demo>()

    fun add(demo: Demo) {
        list.add(demo)
    }

    override fun toString() = "$name contains ${list.size} demos."
}

// - No variable needed
// - No extension method
// - it refers to scope object
// - return = lambda return
val result = Demo("First").also {
    println("Side effect form \"$it\"")
    // return value NOT needed
}

println(result)  // First contains 0 demos.
