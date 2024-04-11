// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.null_.null_check

fun main() {
    var str: String? = "abc"

    if (str != null) {
        println(str.length)  // 3
    }

    str = null

    if (str != null) {
        println(str.length)  // Not executed
    }
}
