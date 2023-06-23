// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.destructuring.mapentry

fun main() {
    for ((entryKey, entryValue) in mapOf(Pair ("one", 1), Pair("two", 2))) {
        println("$entryKey: $entryValue")
        // one: 1
        // two: 2
    }
}
