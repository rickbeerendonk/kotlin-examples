// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// 0, 1 or more parameters

val zero = {}
val one = { a: Int -> a }
val two = { a: Int, b: Int -> a * b }

println(zero())
println(one(2))
println(two(2, 3))

// kotlin.Unit
// 2
// 6