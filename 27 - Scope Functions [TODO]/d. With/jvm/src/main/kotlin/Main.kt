// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.scopefunctions.with

class Demo(val name: String) {
    private val list = mutableListOf<Demo>()

    fun add(demo: Demo) {
        list.add(demo)
    }

    override fun toString() = "$name contains ${list.size} demos."
}

fun main() {
    // - No variable needed
    // - No extension method
    // - this refers to object
    // - return = lambda return
    val result = with(Demo("First")) {
        add(Demo("one"))
        add(Demo("two"))
        println(this)  // First contains 2 demos.
        this // return value
    }

    println(result)  // First contains 2 demos.
}
