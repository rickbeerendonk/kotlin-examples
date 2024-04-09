// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

println(true)
println(false)

println(true::class.simpleName)    // Boolean
println(true::class.qualifiedName) // kotlin.Boolean

// Explicit vs Implicit

val explicit: Boolean = true
val implicit = true

println(explicit::class.qualifiedName) // kotlin.Boolean
println(implicit::class.qualifiedName) // kotlin.Boolean