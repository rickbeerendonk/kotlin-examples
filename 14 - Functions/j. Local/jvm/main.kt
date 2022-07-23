// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.functions.local

fun test() {
    fun local(text: String) {
        println(text)
    }

    local("abc")
}

fun main() {
    test()
}
