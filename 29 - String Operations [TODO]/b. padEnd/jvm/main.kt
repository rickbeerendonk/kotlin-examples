// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.stringoperations.padEnd

fun main() {
    println("0".padEnd(3))           // '0  '

    println("000".padEnd(1, 'X'))    // 000
    println("000".padEnd(3, 'X'))    // 000
    println("000".padEnd(5, 'X'))    // 000XX
}
