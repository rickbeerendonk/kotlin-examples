// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.lambdas.funtypes

fun main() {
    val noReturn:   () -> Unit              = fun () {}
    val zeroParams: () -> String            = fun (): String = "nothing to see here"
    val oneParam:   (Int) -> String         = fun (a: Int): String = "a=${a}"
    val twoParams:  (Int, String) -> String = fun (a: Int, b: String): String = "a=${a}, b=${b}"

    println(noReturn())         // kotlin.Unit
    println(zeroParams())       // nothing to see here
    println(oneParam(1))        // a=1
    println(twoParams(1, "2"))  // a=1, b=2
}
