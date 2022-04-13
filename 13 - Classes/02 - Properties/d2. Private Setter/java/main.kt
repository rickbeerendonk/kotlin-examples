// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.classes.properties.private_setter

class Demo {
    var prop = "init"
        private set

    fun setProp(value: String) {
        this.prop = value
    }
}

fun main() {
    val demo = Demo()
    println(demo.prop)  // init

    // error: cannot assign to 'prop': the setter is private
    //demo.prop = "new"

    // no error
    demo.setProp("new")

    println(demo.prop)  // new
}
