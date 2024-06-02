// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.sequences.iterablevssequence

data class Product(val name: String, val price: Double, val stock: Int)

fun main() {
    val productsList = listOf(
        Product("Apple",    10.0, 100),
        Product("Banana",    5.0, 200),        
        Product("Carrot",   20.0,  50),
        Product("Date",     40.0, 300),
        Product("Eggplant", 15.0, 150),
        Product("Fig",      30.0, 250),
        Product("Grape",    20.0, 350)
    )

    val productsSequence = productsList.asSequence()

    // Iterable (Eager evaluation)

    println("-- Iterable 1 (map) --")
    val productsListMap = productsList.map { println(it.name); it.name }
    println("-- Iterable 2 (take) --")
    val productsListTake = productsListMap.take(2)
    println("-- Iterable 3 (print) --")
    println(productsListTake)

    // Sequence (Lazy evaluation)

    println("-- Sequence 1 (map) --")
    val productsSequenceMap = productsSequence.map { println(it.name); it.name }
    println("-- Sequence 2 (take) --")
    val productsSequenceTake = productsSequenceMap.take(2)
    println("-- Sequence 3 (print) --")
    println(productsSequenceTake.toList())
}

// -- Iterable 1 (map) --
// Apple
// Banana
// Carrot
// Date
// Eggplant
// Fig
// Grape
// -- Iterable 2 (take) --
// -- Iterable 3 (print) --
// [Apple, Banana]
// -- Sequence 1 (map) --
// -- Sequence 2 (take) --
// -- Sequence 3 (print) --
// Apple
// Banana
// [Apple, Banana]