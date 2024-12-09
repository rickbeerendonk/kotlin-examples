// European Union Public License version 1.2
// Copyright © 2024 Rick Beerendonk

package org.collections.api.map

data class Product(val name: String, val price: Double, val stock: Int)

fun main() {
    val products = listOf(
        Product("Apple",    10.0, 100),
        Product("Banana",    5.0, 200),        
        Product("Carrot",   20.0,  50),
        Product("Date",     40.0, 300),
        Product("Eggplant", 15.0, 150),
        Product("Fig",      30.0, 250),
        Product("Grape",    20.0, 350)
    )

    // Show information in a custom format
    println(products.map { "${it.name} (price = ${it.price}) (stock = ${it.stock})" } )

    // [
    //    Apple (price = 10.0) (stock = 100), 
    //    Banana (price = 5.0) (stock = 200), 
    //    Carrot (price = 20.0) (stock = 50), 
    //    Date (price = 40.0) (stock = 300), 
    //    Eggplant (price = 15.0) (stock = 150), 
    //    Fig (price = 30.0) (stock = 250), 
    //    Grape (price = 20.0) (stock = 350)
    // ]
    
    // Show only prices
    println(products.map { it.price } )

    // [10.0, 5.0, 20.0, 40.0, 15.0, 30.0, 20.0]

}