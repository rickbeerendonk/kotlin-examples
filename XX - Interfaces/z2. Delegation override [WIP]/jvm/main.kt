// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.interfaces.delegationoverride

interface Intf {
    fun print() {
        "Interface"
    }
}

class Base(val message: String) : Intf {
    override fun print() { println(message) }
}

class Derived(b: Base) : Intf by b {
    override fun print() { println("Derived: " + super.print()) }
}

fun main() {
    val d = Derived(Base("Message in Base"))
    val i: Intf = d;

    println(d.print())
    // Message in Base

    println(i.print())
    // Message in Base
}