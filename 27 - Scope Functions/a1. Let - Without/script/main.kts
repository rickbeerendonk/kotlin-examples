// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

class Demo(val name: String) {
    private val list = mutableListOf<Demo>()

    fun add(demo: Demo) {
        list.add(demo)
    }

    override fun toString() = "$name contains ${list.size} demos."
}

// Without Scope Function:
// - variable needed
// - name repeated everywhere
val demo = Demo("First");
demo.add(Demo("one"))
demo.add(Demo("two"))
println(demo)    // First contains 2 demos.
