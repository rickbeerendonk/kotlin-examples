// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

class Demo(val name: String) {
    private val list = mutableListOf<Demo>()

    fun add(demo: Demo) {
        list.add(demo)
    }

    override fun toString() = "$name contains ${list.size} demos."
}

// With:
// - No variable needed
// - it refers to object
// let() has NO return value (kotlin.Unit)
Demo("First").let {
    it.add(Demo("one"))
    it.add(Demo("two"))
    println(it)  // First contains 2 demos.
}