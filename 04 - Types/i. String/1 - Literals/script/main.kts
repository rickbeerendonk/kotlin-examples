// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// Single line

val str = "Text"
println(str)                       // Text
println(str.length)                // 4
println(str.subSequence(1, 3))     // ex
println(str::class.qualifiedName)  // kotlin.String

// Multi line

val multi1 = """
    one
    "two"
"""
println(multi1)

val multi2 = """
    one
    "two"
""".trimIndent()
println(multi2)

val multi3 = """
    |  one
    |  "two"
""".trimMargin()
println(multi3)

// Get character

println(str[0])                       // T
println(str[0]::class.qualifiedName)  // kotlin.Char


// Special characters (single line)

println("first \"line\" \nsecond line")