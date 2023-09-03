// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.scopefunctions.run

class Demo(val name: String) {
    private val list = mutableListOf<Demo>()

    fun add(demo: Demo) {
        list.add(demo)
    }

    override fun toString() = "$name contains ${list.size} demos."
}

fun main() {
    // With:
    // - No variable needed
    // - this refers to object
    // - run() return = lambda return
    val result = Demo("First").run {
        add(Demo("one"))
        add(Demo("two"))
        println(this)  // First contains 2 demos.
        this // return value
    }

    println(result)  // First contains 2 demos.
}
