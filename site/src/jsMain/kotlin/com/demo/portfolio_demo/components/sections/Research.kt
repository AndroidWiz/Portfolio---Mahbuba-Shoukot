package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.ResearchStyle
import com.demo.portfolio_demo.components.styles.SectionDescriptionStyle
import com.demo.portfolio_demo.components.widgets.ResearchBlock
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.Res
import com.demo.portfolio_demo.utils.getAllResearch
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Span

@Composable
fun Research() {
    Column(
        modifier = ResearchStyle.toModifier().id("research")
            .then(Modifier.margin(top = 3.cssRem, bottom = 10.cssRem)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.RESEARCH_TITLE)

        SpanText(
            text = Constants.RESEARCH_SECTION_TEXT,
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

        Span(
            SectionDescriptionStyle.toModifier()
                .textAlign(TextAlign.Center)
                .fontFamily(Res.Fonts.DM_SANS)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                )
                .toAttrs()
        ) {
            SpanText(
                text = Constants.DISSERTATION
            )
            SpanText(
                text = Constants.RESEARCH_DISSERTATION_TEXT,
                modifier = Modifier
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Black
                            ColorMode.DARK -> Colors.White
                        }
                    )
            )
        }
        /*SpanText(
            text = Constants.RESEARCH_DISSERTATION_TEXT,
            modifier = SectionDescriptionStyle.toModifier()
                .textAlign(TextAlign.Center)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                )
                .fontFamily(Res.Fonts.DM_SANS)
        )*/

        SimpleGrid(
            modifier = Modifier.fillMaxWidth().margin(top = 1.cssRem),
            numColumns = numColumns(base = 1)
        ) {

            val researches = getAllResearch()

            repeat(researches.size) {
                ResearchBlock(research = researches[it])
            }

        }
    }
}