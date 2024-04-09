// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// Options

println(true)
println(false)

// Explicit vs Implicit

val explicit: Boolean = true
val implicit = true

println(explicit::class.qualifiedName) // kotlin.Boolean
println(implicit::class.qualifiedName) // kotlin.Boolean