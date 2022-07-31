// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun test(vararg a: Any) {
    // vararg is an Array
    for (item in a) println(item)   // 1, Kotlin, 2022
    println(a.size)                 // 3
    println(a::class.qualifiedName) // kotlin.Array
}

test(1, "Kotlin", 2022)
