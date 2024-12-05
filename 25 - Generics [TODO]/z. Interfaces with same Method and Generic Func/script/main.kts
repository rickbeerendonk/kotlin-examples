// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

interface A {
    fun foo() = "A"
}

interface B {
    fun foo() = "B"
}

class C: A, B {
    override fun foo() = super<A>.foo() + super<B>.foo()
}

fun <T> write1(value: T) where T: A, T: B {
    println(value.foo())
    val a: A = value
    println(a.foo())
    println((value as B).foo())
}

// See warning
fun <T: A> write2(value: T) where T: B {
    println(value.foo())
    println((value as A).foo())
    println((value as B).foo())
}

val c = C()
write1(c)
write2(c)
