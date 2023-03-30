// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk


class Demo (val name: String) {
    var other: Int = 0

    constructor (name: String, other: Int) : this(name) {
        this.other = other
        //println("2nd constructor")
    }
}

val d1 = Demo("one")
println(d1.name)
println(d1.other)

val d2 = Demo("two", 222)
println(d2.name)
println(d2.other)
