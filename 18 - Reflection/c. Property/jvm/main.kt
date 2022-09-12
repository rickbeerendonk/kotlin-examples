// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.reflection._property

import kotlin.reflect.*

fun main() {
    // Property Reference
    val ref: KProperty1<String, Int> = String::length

    println("Length: ${ref("abc")}")        // 3

    println("Abstract: ${ref.isAbstract}")  // false
    println("Const: ${ref.isConst}")        // false
    println("Final: ${ref.isFinal}")        // true
    println("Lateinit: ${ref.isLateinit}")  // false
    println("Open: ${ref.isOpen}")          // false
    println("Suspend: ${ref.isSuspend}")    // false

    // TODO
    println("annotations: ${ref.annotations}")
    println("getter: ${ref.getter}")
    println("name: ${ref.name}")
    println("parameters: ${ref.parameters}")
    println("returnType: ${ref.returnType}")
    println("typeParameters: ${ref.typeParameters}")
    println("visibility: ${ref.visibility}")
}
