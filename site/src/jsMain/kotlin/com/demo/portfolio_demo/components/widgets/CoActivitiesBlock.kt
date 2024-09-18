package com.demo.portfolio_demo.components.widgets

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.CoActivityItemTitleStyle
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.*
import kotlin.math.max

@Composable
fun CoActivitiesBlock(
    modifier: Modifier = Modifier,
    src: String,
    title: String
) {

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxWidth()
            .padding(leftRight = 0.5.cssRem, topBottom = 0.25.cssRem)
            .margin(leftRight = 0.5.cssRem, topBottom = 0.25.cssRem)
            .then(modifier)
    ) {
        CoActivitiesBlock2(modifier = modifier, src = src, title = title)

    }
}

@Composable
fun CoActivitiesBlock2(
    modifier: Modifier = Modifier,
    src: String,
    title: String
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
//            .heightIn(min = 200.px, max = 270.px)
            .heightIn(min = 270.px)
            .margin(topBottom = 0.5.cssRem)
            .borderRadius(10.px)
            .overflow(Overflow.Hidden)
            .position(Position.Relative)
            .backgroundColor(color = Colors.White)
            .border(
                width = 1.px, style = LineStyle.Solid, color = when (ColorMode.current) {
//                    ColorMode.LIGHT -> Color.rgb(0xFFFDD0)
//                    ColorMode.DARK -> Color.rgb(0xFFFDD0)
                    ColorMode.LIGHT -> Colors.White
                    ColorMode.DARK -> Colors.White
                }
            )
            .then(modifier)
    ) {
        Image(
            modifier = Modifier.fillMaxSize()
                .position(Position.Absolute)
                .borderRadius(10.px)
                .objectFit(ObjectFit.Fill),
            src = src
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .borderRadius(10.px)
        ) {
            SpanText(
                text = title,
                modifier = CoActivityItemTitleStyle.toModifier()
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(leftRight = 10.px, topBottom = 10.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.White
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Fonts.Space_Grotesk)
                    .fontWeight(FontWeight.Medium)
                    .backdropFilter(if (title.isNotEmpty()) blur(30.px) else blur(0.px))
            )
        }
    }
}