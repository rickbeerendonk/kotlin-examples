// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

interface Intf {
    fun print() {
        println("Intf")
    }
}

class Base() : Intf {
    override fun print() { 
        println("Base")  
        super.print() 
    }
}

class Derived(b: Base) : Intf by b {
    override fun print() {
        println("Derived") 
        super.print() 
    }
}

val b = Base()
b.print();
// Base
// Intf

val d = Derived(b)
d.print()
// Derived
// Intf

val i: Intf = d
i.print()
// Derived
// Intf
