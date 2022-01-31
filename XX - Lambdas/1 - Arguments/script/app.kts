// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

val zero = {1}
val one = { a: Int -> a }
val two = { a: Int, b: Int -> a * b }

println(zero())
println(one(2))
println(two(2, 3))

// 1
// 2
// 6