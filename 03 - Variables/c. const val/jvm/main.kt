// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.variables.const

// Explicit type
const val EXPLICIT: Int = 123

// Implicit type
const val IMPLICIT = 456

// error: Only primitives and String are allowed
//const val IS_ERROR = listOf("a", "b")

fun main() {
    println(EXPLICIT::class.simpleName) // Int
    println(IMPLICIT::class.simpleName) // Int

    //error: modifier 'const' is not applicable to 'local variable'
    //const val ILLEGAL = 789

    // error: val cannot be reassigned
    //EXPLICIT = IMPLICIT
}
