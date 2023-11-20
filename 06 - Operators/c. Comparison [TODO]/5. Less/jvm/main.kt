// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.operators.comparison.less

fun main() {
    val a = 2;
    val b = 2;
    val c = 1;

    // 2 < 2
    println(a < b); // false

    // 2 < 1
    println(a < c); // false

    // 1 < 2
    println(c < a); // true
}
