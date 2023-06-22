// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

interface Intf {
    fun print()
}

class Base(val message: String) : Intf {
    override fun print() { println(message) }
}

class Derived(b: Base) : Intf by b


val b = Base("Message in Base")
Derived(b).print()

// Message in Base