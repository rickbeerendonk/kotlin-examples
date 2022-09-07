// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

class Demo() {
    operator fun component1() = "one"
    operator fun component2() = "two"
}

val (first, second) = Demo()

println(first)   // one
println(second)  // two
