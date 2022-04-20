// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.null_.nullable

fun main() {
    var str: String? = "abc";

    println(str)  // abc

    // no error
    str = null;

    println(str)  // null
}
