package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.SectionDescriptionStyle
import com.demo.portfolio_demo.components.styles.WritingsStyle
import com.demo.portfolio_demo.components.widgets.AppearanceAwareImage
import com.demo.portfolio_demo.components.widgets.RoundedImage
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.Res
import com.demo.portfolio_demo.utils.getAllWritings
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px


@Composable
fun Writings() {
    Column(
        modifier = WritingsStyle.toModifier().id("writings"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.WRITING_TITLE)

        SpanText(
            text = Constants.WRITING_SECTION_TEXT,
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

        SimpleGrid(
            numColumns = numColumns(base = 1, sm = 2, md = 3),
//            numColumns = numColumns(base = 1, sm = 2, md = 2),
            modifier = Modifier.fillMaxWidth().margin(top = 3.cssRem, bottom = 6.cssRem)
        ) {
            val allWritings = getAllWritings()

            repeat(allWritings.size) {
                val writing = allWritings[it]
                RoundedImage(
                    src = writing.first,
                    navigateTo = writing.second
                )
            }

            Box(
                modifier = Modifier.fillMaxSize().padding(topBottom = 50.px),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Link(
                        path = Constants.TUMBLR_URL,
                        text = Constants.MORE_ON_TUMBLR,
                        modifier = Modifier
                            .fontFamily(Res.Fonts.DM_SANS)
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Colors.Black
                                    ColorMode.DARK -> Colors.White
                                }
                            )
                            .margin(right = 4.px)
                    )
                    AppearanceAwareImage(
                        src = Res.Images.NAVIGATION_ARROW
                    )
                }
            }
        }
    }
}