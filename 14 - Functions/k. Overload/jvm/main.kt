// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.overload

fun test() = "test"

fun test(value: String) = "echo $value"

fun main() {
    println(test())       // test
    println(test("abc"))  // echo abc
}
