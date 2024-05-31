// European Union Public License version 1.2
// Copyright © 2023 Rick Beerendonk

package org.enumclasses.basics

enum class TulipLifecycle {
    PLANTED, GROWING, BLOOMING, WITHERING
}

fun main() {
    // Name & Ordinal
    println("\nName & Ordinal:")
    val lifecycleStage = TulipLifecycle.BLOOMING
    println(lifecycleStage)                         // BLOOMING
    println(lifecycleStage.name)                    // BLOOMING
    println(lifecycleStage.ordinal)                 // 2

    // Entries (v1.9+)
    println("\nAll entries:")
    val enumEntries = TulipLifecycle.entries
    for (v in enumEntries) {
        println(v)                                  // PLANTED, GROWING, BLOOMING, WITHERING
    }

    // Values (Don't use as of v1.9, entries is more performant)
    println("\nAll values:")
    val enumValues = TulipLifecycle.values()
    for (v in enumValues) {
        println(v)                                  // PLANTED, GROWING, BLOOMING, WITHERING
    }

    // ValueOf
    println("\nValueOf:")
    val value = TulipLifecycle.valueOf("PLANTED")
    println(value)                                  // PLANTED
    println(value.name)                             // PLANTED
    println(value.ordinal)                          // 0

    // Equals
    println("\nEquals:")
    val anotherStage: TulipLifecycle = TulipLifecycle.BLOOMING
    println(lifecycleStage.equals(anotherStage))    // true
    println(lifecycleStage == anotherStage)         // true
}
