// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.reflection._fun

import kotlin.reflect.*

fun demo1() {}
fun demo2(value: Int) = value.toString()

fun main() {
    // Function Reference
    //val ref: KFunction0<Unit> = ::demo1
    val ref: KFunction1<Int, String> = ::demo2
    //val ref4: KProperty1<String, Int> = String::length

    println("Abstract: ${ref.isAbstract}")  // false
    println("External: ${ref.isExternal}")  // false
    println("Final: ${ref.isFinal}")        // true
    println("Infix: ${ref.isInfix}")        // false
    println("Inline: ${ref.isInline}")      // false
    println("Open: ${ref.isOpen}")          // false
    println("Operator: ${ref.isOperator}")  // false
    println("Suspend: ${ref.isSuspend}")    // false

    // TODO
    println("annotations: ${ref.annotations}")
    println("name: ${ref.name}")
    println("parameters: ${ref.parameters}")
    println("returnType: ${ref.returnType}")
    println("typeParameters: ${ref.typeParameters}")
    println("visibility: ${ref.visibility}")
}
