// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.variables.val

fun main() {
    // Explicit type
    val explicit: Int = 123

    // Implicit type
    val implicit = 456

    println(explicit::class.simpleName) // Int
    println(implicit::class.simpleName) // Int

    // error: val cannot be reassigned
    // explicit = implicit
}
