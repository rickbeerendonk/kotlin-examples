// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.sequences.api.distinct

data class Product(val name: String, val price: Double, val stock: Int)

fun main() {
    val products = sequenceOf(
        Product("Apple",    10.0, 100),
        Product("Banana",    5.0, 200),        
        Product("Carrot",   20.0,  50),
        Product("Date",     40.0, 300),
        Product("Eggplant", 15.0, 150),
        Product("Fig",      30.0, 250),
        Product("Grape",    20.0, 350)
    )

    // Show only distinct prices
    println(products.map({ it.price }).distinct().toList())

    // [10.0, 5.0, 20.0, 40.0, 15.0, 30.0]
}