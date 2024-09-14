package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.AboutStyle
import com.demo.portfolio_demo.components.styles.SectionDescriptionStyle
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode

@Composable
fun About() {
    Column(
        modifier = AboutStyle.toModifier().id("about"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.ABOUT_ME_TITLE)

        SpanText(
            text = Constants.ABOUT_ME_TEXT,
            modifier = SectionDescriptionStyle.toModifier()
                .textAlign(TextAlign.Center)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                )
                .fontFamily(Res.Fonts.DM_SANS)
        )
    }
}