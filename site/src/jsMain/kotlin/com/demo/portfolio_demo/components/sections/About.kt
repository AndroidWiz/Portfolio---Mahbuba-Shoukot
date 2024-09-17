package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.AboutStyle
import com.demo.portfolio_demo.components.styles.SectionDescriptionStyle
import com.demo.portfolio_demo.components.widgets.CircleImage
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.*

@Composable
fun About() {
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = AboutStyle.toModifier().id("about"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.ABOUT_ME_TITLE)

        when (breakpoint) {
            Breakpoint.ZERO,
            Breakpoint.SM -> {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    AboutContent(
                        textAlignment = TextAlign.Center,
//                        imageWidth = 330.px,
//                        imageHeight = 260.px,
                        textMaxWidthPercentage = 100.percent,
                        imageMaxWidthPercentage = 100.percent
                    )
                }
            }

            else -> {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    AboutContent(
                        textAlignment = TextAlign.Start,
//                        imageWidth = 430.px,
//                        imageHeight = 260.px,
                        textMaxWidthPercentage = 50.percent,
                        imageMaxWidthPercentage = 40.percent
                    )

                    /*SpanText(
                        text = Constants.ABOUT_ME_TEXT,
                        modifier = SectionDescriptionStyle
                            .toModifier()
                            .textAlign(TextAlign.Unset)
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Colors.Gray
                                    ColorMode.DARK -> Colors.DimGray
                                }
                            )
                            .fontFamily(Res.Fonts.DM_SANS)
                            .fillMaxWidth(50.percent)
                    )

                    // Image
                    CircleImage(
                        modifier = Modifier
                            .width(400.px)
                            .height(300.px)
                            .fillMaxWidth(40.percent),
                        src = Res.Images.MY_IMAGE_3
                    )*/
                }
            }
        }
    }
}

@Composable
fun AboutContent(
    textAlignment: TextAlign,
//    imageWidth: CSSpxValue,
//    imageHeight: CSSpxValue,
    textMaxWidthPercentage: CSSSizeValue<CSSUnit.percent>,
    imageMaxWidthPercentage: CSSSizeValue<CSSUnit.percent>
) {

    SpanText(
        text = Constants.ABOUT_ME_TEXT,
        modifier = SectionDescriptionStyle
            .toModifier()
            .textAlign(textAlignment)
            .color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Gray
                    ColorMode.DARK -> Colors.DimGray
                }
            )
            .fontFamily(Res.Fonts.DM_SANS)
            .fillMaxWidth(textMaxWidthPercentage)
    )

// Image
    CircleImage(
        modifier = Modifier
//            .width(imageWidth)
//            .height(imageHeight)
            .fillMaxWidth(imageMaxWidthPercentage),
        src = Res.Images.MY_IMAGE_3
    )
}

/*
Row(
horizontalArrangement = Arrangement.SpaceBetween,
verticalAlignment = Alignment.CenterVertically,
modifier = Modifier.fillMaxWidth()
) {
    SpanText(
        text = Constants.ABOUT_ME_TEXT,
        modifier = SectionDescriptionStyle.toModifier()
//                    .width(560.px)
//                    .textAlign(TextAlign.Center)
            .textAlign(TextAlign.Start)
            .color(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Colors.Gray
                    ColorMode.DARK -> Colors.DimGray
                }
            )
            .fontFamily(Res.Fonts.DM_SANS)
    )

    //            Box {

    // Image
    */
/*      CircleImage(
              modifier = Modifier
//                    .fillMaxWidth()
//                    .height(350.px),
                  .width(330.px)
                  .height(260.px),
//                    .size(300.px),
              src = Res.Images.MY_IMAGE_3
          )*//*

//            }
}*/
