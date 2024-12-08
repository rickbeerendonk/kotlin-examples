// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.types.char

fun main() {
    val explicit: Char = 'a'
    val implicit = 'a'
    println(explicit::class.qualifiedName)  // kotlin.Char
    println(implicit::class.qualifiedName)  // kotlin.Char

    // Special
    println('\t')      // (tab)
    println('\b')      // (backspace)
    println('\n')      // (new-line)
    println('\r')      // (return)
    println('\'')      // '
    println('\"')      // "
    println('\\')      // \
    println('\$')      // $
    println('\uFF00')  // (unicode)
}
