// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.reflection._fun

import kotlin.reflect.*

fun demo1() {}
private fun demo2(value: Int) = value.toString()

fun main() {
    // Function Reference
    //val ref: KFunction0<Unit> = ::demo1
    val ref: KFunction1<Int, String> = ::demo2

    println("Call ref with 456: ${ref(456)}")

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
    println("name: ${ref.name}")                      // demo2
    println("parameters: ${ref.parameters}")          // [parameter #0 value of fun demo2(kotlin.Int): kotlin.String]
    println("returnType: ${ref.returnType}")          // kotlin.String
    println("typeParameters: ${ref.typeParameters}")
    println("visibility: ${ref.visibility}")          // PRIVATE
}
