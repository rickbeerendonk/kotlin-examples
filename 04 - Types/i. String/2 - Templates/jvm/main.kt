// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.types.string.templates

fun main() {
    val bool = true
    val number = 123
    val text = "abc"

    // Single line
    println("bool: $bool, number+1: ${number + 1}, text: $text (length: ${text.length}), slash: \\, double quotes: \"")
    // bool: true, number+1: 124, text: abc (length: 3), slash: \, double quotes: "

    // Multi line
    println("""
bool: $bool
number+1: ${number + 1}
text: $text (length: ${text.length})
dollar: $${"text"}
slash: \
double quotes: "
""")
    // bool: true
    // number+1: 124
    // text: abc (length: 3)
    // slash: \
    // double quotes: "
}
