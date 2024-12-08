// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.classes.sealed

open class A {
    open fun foo() = "A.foo()"
}

// Other module: Subclasses are not possible
sealed class B : A() {
    override fun foo() = "B.foo() " + super.foo()
}

// Same module: Subclasses are possible
class C : B() {
    override fun foo() = "C.foo() " + super.foo()
}

fun main() {
    val c = C()
    println(c.foo())                // C.foo() B.foo() A.foo()
    println(c::class.qualifiedName) // org.classes.sealed.C
}
