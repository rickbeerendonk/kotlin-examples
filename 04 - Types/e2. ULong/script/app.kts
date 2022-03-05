// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

println(ULong.MIN_VALUE)  // 0
println(ULong.MAX_VALUE)  // 18446744073709551615

// Explicit vs Implicit
val explicit: ULong = 1UL
val implicit1 = 1U
val implicit2 = 1UL

println(explicit::class.qualifiedName)  // kotlin.ULong
println(implicit1::class.qualifiedName) // kotlin.UInt
println(implicit2::class.qualifiedName) // kotlin.ULong