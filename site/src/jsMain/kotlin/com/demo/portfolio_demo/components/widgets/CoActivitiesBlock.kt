package com.demo.portfolio_demo.components.widgets

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.CoActivityItemTitleStyle
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
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

        /*Column(
            modifier = modifier.fillMaxWidth()
                .margin(topBottom = 6.px)
                .padding(topBottom = 6.px)
        ) {*/
        CoActivitiesImage(
            modifier = modifier.fillMaxWidth()
                .heightIn(max = 270.px)
                .overflow(Overflow.Hidden)
                .position(Position.Relative)
                .border(
                    width = 1.px, style = LineStyle.Solid, color = when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                ),
            src = src,
            title = title
        )
        /*   SpanText(
               text = title,
               modifier = CoActivityItemTitleStyle.toModifier()
                   .fillMaxWidth()
                   .margin(leftRight = 10.px)
                   .color(
                       when (ColorMode.current) {
                           ColorMode.LIGHT -> Colors.Black
                           ColorMode.DARK -> Colors.White
                       }
                   )
                   .fontFamily(Res.Fonts.Space_Grotesk)
                   .fontWeight(FontWeight.Medium)
           )*/
//        }

    }
}

@Composable
fun CoActivitiesImage(
    modifier: Modifier = Modifier,
    src: String,
    title: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
//            .padding(5.px)
            .borderRadius(10.px).then(modifier)
    ) {
        val backgroundGradient = when (ColorMode.current) {
//            ColorMode.LIGHT -> "linear-gradient(180deg, rgba(255, 255, 255, 0.00) 70%, rgba(255, 255, 255, 0.71) 100%)"
//            ColorMode.LIGHT -> "linear-gradient(180deg, rgba(0, 0, 0, 0.00) 75%, rgba(0, 0, 0, 0.55) 100%)"
            ColorMode.LIGHT -> "linear-gradient(180deg, rgba(255, 255, 255, 0.00) 75%, rgba(128, 128, 128, 0.75) 100%)"  // Grayish for light mode
            ColorMode.DARK -> "linear-gradient(180deg, rgba(0, 0, 0, 0.00) 70%, rgba(0, 0, 0, 0.71) 100%)"
        }

        Image(
            modifier = Modifier
//                .fillMaxWidth()
//                .position(Position.Absolute)
//                .heightIn(100.px)
//                .height(300.px)
                .fillMaxSize()
                .borderRadius(10.px)
                .objectFit(ObjectFit.ScaleDown),
            src = src
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .borderRadius(10.px)
//                .styleModifier {
//                    property("background", backgroundGradient)
//                }
                /*.styleModifier {
                    property(
                        "background",
//                        "linear-gradient(180deg, rgba(0, 0, 0, 0.00) 50.52%, rgba(0, 0, 0, 0.71) 100%)"
                        "linear-gradient(180deg, rgba(0, 0, 0, 0.00) 75%, rgba(0, 0, 0, 0.71) 100%)"
                    )
                }*/
        ) {
            /*Image(
                src = Res.Images.TUMBLR_ROUND,
                modifier = Modifier.size(22.px)
                    .align(Alignment.BottomEnd)
                    .margin(bottom = 10.px, right = 10.px)
            )*/
            SpanText(
                text = title,
                modifier = CoActivityItemTitleStyle.toModifier()
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
//                    .margin(bottom = 10.px)
                    .padding(leftRight = 10.px, topBottom = 10.px)
//                    .margin(leftRight = 10.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Colors.Black
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Fonts.Space_Grotesk)
                    .fontWeight(FontWeight.Medium)
                    .backdropFilter(if(title.isNotEmpty()) blur(30.px) else blur(0.px))
            )
        }
    }
}

/*Box(
    modifier = Modifier
        .fillMaxWidth().then(modifier)
        .padding(all = 6.px),
    contentAlignment = Alignment.Center
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(10.px)
            .display(DisplayStyle.Block),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            src = src,
            modifier = Modifier
//                    .fillMaxWidth()
                .borderRadius(10.px)
                .heightIn(max = 120.px)
        )
        Spacer()
        SpanText(
            text = title,
            modifier = CoActivityItemTitleStyle.toModifier()
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
    }
}*/