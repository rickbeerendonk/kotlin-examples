// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

println(Long.MIN_VALUE)  // -9223372036854775808
println(Long.MAX_VALUE)  // 9223372036854775807

// Explicit vs Implicit
val explicit: Long = 9223372036854775807
val implicit = 9223372036854775807

println(explicit::class.qualifiedName) // kotlin.Long
println(implicit::class.qualifiedName) // kotlin.Long