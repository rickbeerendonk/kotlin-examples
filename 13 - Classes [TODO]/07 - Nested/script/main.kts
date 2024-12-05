// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

open class Outer {
    // protected is only applicable to nested classes
    protected class Nested_Protected() {
        fun foo(): String {
            return "Protected Nested"
        }
    }

    // protected is only applicable to nested classes
    class Nested() {
        fun foo(): String {
            return "Nested"
        }
    }
}

class OuterSub : Outer() {
    fun useProtectedNested(): String {
        val nestedProtected = Outer.Nested_Protected()
        return nestedProtected.foo()
    }
}


// -- Public --

val nested = Outer.Nested()
println(nested.foo())  // Nested

// -- Protected --

// Doesn't compile
//val nestedProtected = Outer.Nested_Protected()
//println(nestedProtected.foo())

val outerSub = OuterSub()
println(outerSub.useProtectedNested())  // Protected Nested
