package com.demo.portfolio_demo.components.widgets

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.model.*
import com.demo.portfolio_demo.components.styles.*
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.w3c.dom.CustomEvent

@Composable
fun ResearchBlock(
    modifier: Modifier = Modifier,
    research: Researches
) {
    val ctx = rememberPageContext()

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
            .fontFamily(Res.Fonts.DM_SANS)
            .then(modifier)
            .cursor(Cursor.Pointer)
            .onClick { if (research.link.isNotEmpty()) ctx.router.navigateTo(research.link) }
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(leftRight = 0.5.cssRem)
                .border(
                    width = 2.px, style = LineStyle.Solid, color = when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.FOOTER_COLOR_LIGHT
                        ColorMode.DARK -> Res.Colors.FOOTER_COLOR_LIGHT
                    }
                )
                .backgroundColor(Colors.White)
                .align(Alignment.TopCenter)// added for testing
                .borderRadius(10.px)
                .margin(top = 1.5.cssRem)
                .padding(top = 30.px, bottom = 24.px, leftRight = 24.px),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {

            SpanText(
                text = research.title,
                modifier = ResearchItemTitleStyle.toModifier()
                    .fillMaxWidth()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Black
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Fonts.Space_Grotesk)
                    .fontWeight(FontWeight.Bold)
            )
            SpanText(
                text = research.subTitle,
                modifier = ResearchItemSubtitleStyle.toModifier()
                    .fillMaxWidth()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Gray
                            ColorMode.DARK -> Colors.DimGray
                        }
                    )
                    .fontWeight(FontWeight.Bold)
            )
        }

        Box(
            modifier = Modifier
                .background(
                    when (ColorMode.current) {
//                        ColorMode.LIGHT -> Color.rgb(0xFAFAFA)
                        ColorMode.LIGHT -> Res.Colors.FOOTER_COLOR_LIGHT
                        ColorMode.DARK -> Res.Colors.FOOTER_COLOR_LIGHT
//                        ColorMode.DARK -> Color.rgb(0x06080B)
                    }
                )
                .margin(left = 2.cssRem, top = 0.5.cssRem)
                .padding(leftRight = 1.5.cssRem)
                .clip(shape = Rect(5, 10.px))
                .align(Alignment.TopStart)
        ) {
            SpanText(
                text = research.type,
                modifier = Modifier.fontSize(20.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Black
                            ColorMode.DARK -> Colors.Black
                        }
                    )
                    .fontWeight(FontWeight.Medium)
                    .fontFamily(Res.Fonts.Space_Grotesk)
            )
        }
    }
}