// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.classes.properties.val_var

class Demo {
    val readonly: String = "readonly"
    var readwrite: String = "readwrite"
}

fun main() {
    val demo = Demo()
    println(demo.readonly)   // readonly
    println(demo.readwrite)  // readwrite

    // error: val cannot be reassigned
    //demo.readonly = "changed"    
    
    demo.readwrite = "changed"
    println(demo.readwrite)  // changed
}
