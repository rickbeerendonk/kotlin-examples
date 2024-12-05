// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.classes.properties.define

class Demo {
    val withType: String = "with"
    val withoutType = "without"  // Inferred
}

fun main() {
    val demo = Demo()
    println(demo.withType)     // with
    println(demo.withoutType)  // without
}
