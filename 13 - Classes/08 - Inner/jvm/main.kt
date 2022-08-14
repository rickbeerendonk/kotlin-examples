// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.classes.inner_

class Outer(val value: Int) {
    class Nested() {
        fun foo(): String {
            // value is not accessable
            return "Nested: " //+ value
        }
    }

    inner class Inner() {
        fun foo(): String {
            return "Inner: " + value;
        }
    }
}

fun main() {
    val nested = Outer.Nested()
    println(nested.foo())

    val inner_ = Outer(123).Inner()
    println(inner_.foo())
}
