// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.interfaces.delegation

interface Intf {
    fun print()
}

class Base(val message: String) : Intf {
    override fun print() { println("Base $message") }
}

// No var/val needed
class Derived(b: Base) : Intf by b

fun main() {
    val b1 = Base("First")
    val d1 = Derived(b1)
    d1.print()
    // Base First

    val b2 = Base("Second")
    val d2 = Derived(b2)
    d2.print()
    // Base Second
}