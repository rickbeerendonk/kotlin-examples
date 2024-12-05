// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.classes.constructors.default

// Long notation
class Demo1 constructor(name: String) {}

// Short notation
class Demo2(name: String) {}


fun main() {
    // Running shouldn't fail
    val demo1 = Demo1("one")
    val demo2 = Demo2("two")
}
