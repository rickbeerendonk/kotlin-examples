// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

val zero: () -> Unit        = {}
val one:  (Int) -> Int      = { a -> a }
val two:  (Int, Int) -> Int = { a, b -> a * b }

println(zero())
println(one(2))
println(two(2, 3))

// kotlin.Unit
// 2
// 6

fun myPrint(f: (Int) -> (Int)) {
    println(f(123))
}

myPrint { c -> 2 * c }

// 246
