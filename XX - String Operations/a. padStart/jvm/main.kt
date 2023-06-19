// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.stringoperations.padStart

fun main() {
    println("0".padStart(3))           // '  0'

    println("000".padStart(1, 'X'))    // 000
    println("000".padStart(3, 'X'))    // 000
    println("000".padStart(5, 'X'))    // XX000
}
