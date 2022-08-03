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
        this.publicMember = 1;
        this.anotherPublicMember = 1;
        this.privateMember = 1;
        this.protectedMember = 1;
        this.internalMember = 1;
    }
}

class B : A() {
    fun Test2() {
        this.publicMember = 2;
        this.anotherPublicMember = 2;
        // this.privateMember = 2;
        this.protectedMember = 2;
        this.internalMember = 2;
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
