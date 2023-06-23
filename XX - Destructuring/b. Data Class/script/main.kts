// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

data class Demo(val a: String, val b: String, val c: String)

val (first, second, third) = Demo("one", "two", "three")

println(first)   // one
println(second)  // two
println(third)   // three
