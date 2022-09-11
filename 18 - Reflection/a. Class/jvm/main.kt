// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.reflection._class

import kotlin.reflect.KClass

data class Demo(val prop1: Int) {
    fun meth1() {}
}

fun main() {
    val demo = Demo(123)

    // Class Reference
    val ref: KClass<out Demo> = demo::class

    println("Abstract: ${ref.isAbstract}")    // false
    println("Companion: ${ref.isCompanion}")  // false
    println("Data: ${ref.isData}")            // true
    println("Final: ${ref.isFinal}")          // true
    println("Fun: ${ref.isFun}")              // false
    println("Inner: ${ref.isInner}")          // false
    println("Open: ${ref.isOpen}")            // false
    println("Sealed: ${ref.isSealed}")        // false
    println("Value: ${ref.isValue}")          // false

    ref.members.forEach{ println("Member: ${it.name}") }  // prop1, component1, copy, equals, hashCode, meth1, toString

    // TODO
    println("annotations: ${ref.annotations}")
    println("constructors: ${ref.constructors}")
    println("nestedClasses: ${ref.nestedClasses}")
    println("objectInstance: ${ref.objectInstance}")
    println("qualifiedName: ${ref.qualifiedName}")
    println("sealedSubclasses: ${ref.sealedSubclasses}")
    println("simpleName: ${ref.simpleName}")
    println("supertypes: ${ref.supertypes}")
    println("typeParameters: ${ref.typeParameters}")
    println("visibility: ${ref.visibility}")
}
