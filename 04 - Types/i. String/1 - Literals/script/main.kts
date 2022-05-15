// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

// One line

val str = "Text"
println(str)                       // Text
println(str.length)                // 4
println(str.subSequence(1, 3))     // ex
println(str::class.qualifiedName)  // kotlin.String


// Multi line

val multi = """
    one
    two
"""
println(multi)


// Get character

println(str[0])                       // T
println(str[0]::class.qualifiedName)  // kotlin.Char


// Special characters

println("first \"line\" \nsecond line")