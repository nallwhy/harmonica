package com.improve_future.harmonica.document.view

import com.improve_future.harmonica.document.helper.col
import com.improve_future.harmonica.document.helper.row
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.p

object JarmonicaView : ViewInterface {
    override val path = "jarmonica.html"

    override fun index(): String {
        return Template.default("Home") {
            row {
                col {
                    h1 { +"Jarmonica" }
                }
            }
            row {
                col {
                    p { +"Jarmonica, migration with compiled Kotlin classes." }
                }
            }
        }
    }
}