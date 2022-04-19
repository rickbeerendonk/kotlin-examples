// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.null_.nonnull

fun main() {
    var str: String = "abc";

    // error: null can not be a value of a non-null type String
    str = null;
}
