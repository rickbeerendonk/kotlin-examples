// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

println(Long.MIN_VALUE)  // -9223372036854775808
println(Long.MAX_VALUE)  // 9223372036854775807

// Explicit vs Implicit
val explicit: Long = 1
val implicit1 = 1
val implicit2 = 1L

println(explicit::class.qualifiedName)  // kotlin.Long
println(implicit1::class.qualifiedName) // kotlin.Int
println(implicit2::class.qualifiedName) // kotlin.Long