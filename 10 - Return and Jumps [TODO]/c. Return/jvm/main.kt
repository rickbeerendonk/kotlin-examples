// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.returnjumps.return_

fun foo() {
    println("1")
    return // Unit return type
    println("2")
}

fun main() {
    foo()
    println("Done")

    // 1
    // Done
}
