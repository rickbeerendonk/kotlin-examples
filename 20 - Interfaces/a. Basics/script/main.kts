// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

interface Intf {
    fun print()
}

class One(val message: String) : Intf {
    override fun print() { println("$message") }
}

class Two(val message: String) : Intf {
    override fun print() { println("$message") }
}

var obj: Intf

obj = One("First")
obj.print()
// Base First

obj = Two("Second")
obj.print()
// Base Second
