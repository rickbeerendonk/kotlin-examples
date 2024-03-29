// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// Min and Max

println(Int.MIN_VALUE)  // -2147483648
println(Int.MAX_VALUE)  // 2147483647

// Explicit vs Implicit

val explicit: Int = 2147483647
val implicit = 2147483647

println(explicit::class.qualifiedName) // kotlin.Int
println(implicit::class.qualifiedName) // kotlin.Int

// Literal constants

println(123)   // 123  (Decimals)
println(0b11)  //   3  (Binaries)
println(0xFF)  // 255  (Hexadecimals)

// Underscores

println(1234567890)     // 1234567890
println(1_234_567_890)  // 1234567890