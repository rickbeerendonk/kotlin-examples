// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.conditions.dowhile

fun main() {
    var i = 10

    do {
        println("Iteration $i")
        i++
    } while (i < 5)

    println("End")
}
