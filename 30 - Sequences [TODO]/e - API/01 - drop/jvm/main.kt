// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.sequences.api

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
    
    // Show all except first 2
    println(products.drop(2).toList())

    // [
    //    Product(name=Carrot, price=20.0, stock=50), 
    //    Product(name=Date, price=40.0, stock=300), 
    //    Product(name=Eggplant, price=15.0, stock=150), 
    //    Product(name=Fig, price=30.0, stock=250), 
    //    Product(name=Grape, price=20.0, stock=350)
    // ]
}