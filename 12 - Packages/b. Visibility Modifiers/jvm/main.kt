// European Union Public License version 1.2
// Copyright © 2022 Rick Beerendonk

package org.visibility.two

import org.visibility.one.*

fun main() {
    pub()
    alsoPub()
    inter()     // Same module, so internal is accessable
    //priv()    // Cannot access private items
}
