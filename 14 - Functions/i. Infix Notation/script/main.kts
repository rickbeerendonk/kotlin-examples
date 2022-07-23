// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// infix requirements:
// - member or extension method
// - single parameter without a default (and no vararg)

infix fun Int.power(x: Int): Int {
    var result = this
    for (i in 2..x) result *= this
    return result
}

println(2.power(4))  // 16
println(2 power 4)   // 16

println(3 power 3)  // 27
