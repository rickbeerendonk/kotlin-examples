// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

println(Int.MIN_VALUE)  // -2147483648
println(Int.MAX_VALUE)  // 2147483647

// Explicit vs Implicit
val explicit: Int = 2147483647
val implicit = 2147483647

println(explicit::class.qualifiedName) // kotlin.Int
println(implicit::class.qualifiedName) // kotlin.Int