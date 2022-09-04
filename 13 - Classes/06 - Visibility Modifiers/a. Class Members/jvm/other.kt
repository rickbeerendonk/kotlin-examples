// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.one

open class A {
    public    var publicMember = 0;
              var anotherPublicMember = 0;
    private   var privateMember = 0;
    protected var protectedMember = 0;
    internal  var internalMember = 0;

    fun Test() {
        publicMember = 1;
        anotherPublicMember = 1;
        privateMember = 1;
        protectedMember = 1;
        internalMember = 1;
    }
}

class B : A() {
    fun Test2() {
        publicMember = 2;
        anotherPublicMember = 2;
        // privateMember = 2;
        protectedMember = 2;
        internalMember = 2;
    }
}

class C {
    fun Test() {
        val a = A()
        a.publicMember = 3;
        a.anotherPublicMember = 3;
        // a.privateMember = 3;
        // a.protectedMember = 3;
        a.internalMember = 3;
    }
}
