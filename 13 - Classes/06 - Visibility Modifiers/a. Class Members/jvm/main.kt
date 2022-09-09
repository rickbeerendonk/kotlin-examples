// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.two

import org.one.*

class D {
    fun Test() {
        val a = A()
        a.publicMember = 4
        a.anotherPublicMember = 4
        // a.privateMember = 4
        // a.protectedMember = 4
        a.internalMember = 4
    }
}

fun main() {
}
