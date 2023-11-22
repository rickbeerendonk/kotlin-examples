// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.singleton.dataobject

// No constructor allowed:
data object Demo1 {
    val one = 1
    var two = "two"
}

data object Demo2 {
    val one = 1
    var two = "two"
}

fun main() {
    // Generated Properties
    println(Demo1.one)                // 1
    println(Demo1.two)                // two

    // Supported methods (open):
    println(Demo1.equals(Demo2))      // true
    println(Demo1.hashCode())         // 115307
    println(Demo1.toString())         // Demo(one=1 two=two)

    // NOT Supported methods (final):
    // Demo1.component1()
    // Demo1.component2()
    // Demo1.copy()
}
