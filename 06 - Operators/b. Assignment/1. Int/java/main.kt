// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.operators.assignment.int

fun main() {
    var a = 7
    println("a: ${a}")  // 7

    a = 2
    println("Int: a = 2: ${a}") // 2

    a = 7
    a += 2
    println("Int: a += 2: ${a}") // 9

    a = 7
    a -= 2
    println("Int: a -= 2: ${a}") // 5

    a = 7
    a *= 2
    println("Int: a *= 2: ${a}") // 14

    a = 7
    a /= 2
    println("Int: a /= 2: ${a}") // 3

    a = 7
    a %= 2
    println("Int: a %= 2: ${a}") // 1
}
