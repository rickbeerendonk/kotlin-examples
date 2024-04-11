// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.extension_properties_and_functions.extension_property

class Demo {
    val first = 1
    val second = 2
}

// Extension property
val Demo.sum: Int
    get() = this.first + this.second

fun main() {
    val demo = Demo()

    // Use extension property
    println(demo.sum)  // 3
}
