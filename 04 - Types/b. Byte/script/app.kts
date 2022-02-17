// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// Explicit
val a: Byte = Byte.MIN_VALUE  // -128
val b: Byte = Byte.MAX_VALUE  // 127

println(a)
println(b)

// Explicit vs Implicit
val c: Byte = 127
val d = 127

println(c::class.qualifiedName) // kotlin.Byte
println(d::class.qualifiedName) // kotlin.Int