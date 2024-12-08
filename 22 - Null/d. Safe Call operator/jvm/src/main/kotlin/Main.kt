// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.null_.safe_call_operator

fun main() {
    var str: String? = "abc"

    println(str?.length)  // 3

    str = null

    println(str?.length)  // null
}
