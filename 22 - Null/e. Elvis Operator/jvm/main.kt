// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.null_.elvis_operator

fun main() {
    var str: String? = "abc"

    println(str?.length ?: 0)  // 3

    str = null

    println(str?.length ?: 0)  // Not executed
}
