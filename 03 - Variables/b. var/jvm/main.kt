// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

fun main() {
    // Explicit type
    var explicit: Int = 123

    // Implicit type
    var implicit = 456

    println(explicit::class.simpleName) // Int
    println(implicit::class.simpleName) // Int

    // No error (as opposed to val)
    explicit = implicit

    println(explicit) // 456
}
