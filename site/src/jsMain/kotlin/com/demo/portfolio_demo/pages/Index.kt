package com.demo.portfolio_demo.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.demo.portfolio_demo.components.layouts.PageLayout
import com.demo.portfolio_demo.components.sections.*
import com.demo.portfolio_demo.utils.Res

@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Row(
            Modifier.fillMaxWidth().fontFamily(Res.Fonts.Space_Grotesk).id("home")
        ) {
            Box {

                Column {
                    Home()
                    About()
                    Education()
                    Research()
                    Experience()
                    Photography()
                    Writings()
                }
            }
        }
    }
}