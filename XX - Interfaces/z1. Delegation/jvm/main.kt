// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.interfaces.delegation

interface Intf {
    fun print()
}

class Base() : Intf {
    override fun print() { println("Base") }
}

class Derived(b: Base) : Intf by b

fun main() {
    val b = Base()
    val d = Derived(b)
    d.print()
    // Base
}