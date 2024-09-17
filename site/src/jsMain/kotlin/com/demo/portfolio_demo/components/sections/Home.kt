package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.ButtonStyle
import com.demo.portfolio_demo.components.styles.HelloImStyle
import com.demo.portfolio_demo.components.styles.HeroContainerKeyFrames
import com.demo.portfolio_demo.components.styles.HeroSectionStyle
import com.demo.portfolio_demo.components.styles.UserNameStyle
import com.demo.portfolio_demo.components.styles.UsersMessageStyle
import com.demo.portfolio_demo.HeadlineTextStyle
import com.demo.portfolio_demo.SubheadlineTextStyle
import com.demo.portfolio_demo.components.widgets.CircleImage
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.CustomColorSchemes
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun Home() {
    val breakpoint = rememberBreakpoint()

    Box(
        modifier = HeroSectionStyle.toModifier().animation(
            HeroContainerKeyFrames.toAnimation(
                duration = 1.s,
                timingFunction = AnimationTimingFunction.EaseInOut
            )
        ),
        contentAlignment = Alignment.Center
    ) {
        when (breakpoint) {
            Breakpoint.ZERO,
            Breakpoint.SM -> {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    HomeContent(imageSize = 360.px)
                }
            }

            else -> {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    HomeContent(imageSize = 320.px)
                }
            }
        }


    }
}

@Composable
fun HomeContent(imageSize: CSSpxValue) {
    // Image
    CircleImage(
        modifier = Modifier
            .size(imageSize),
        src = Res.Images.MY_IMAGE
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {

        SpanText(
            text = Constants.HELLO_IM,
            modifier = HelloImStyle.toModifier()
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                )
                .fontWeight(FontWeight.Bold)
        )
        SpanText(
            text = Constants.MAHBUBA_SHOUKOT,
            modifier = UserNameStyle.toModifier()
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Black
                        ColorMode.DARK -> Colors.White
                    }
                )
                .fontWeight(FontWeight.Bold)
        )

        Div(
            attrs = SubheadlineTextStyle.toModifier().margin(top = 20.px)
                .padding(all = 10.px)
                .borderRadius(10.px)
                .backgroundColor(color = Colors.Yellow)
                .toAttrs()
        ) {
            SpanText(
                text = Constants.ROLE,
                modifier = UsersMessageStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
//                                    ColorMode.LIGHT -> Colors.Gray
//                                    ColorMode.DARK -> Colors.DimGray
                            ColorMode.LIGHT -> Colors.Black
                            ColorMode.DARK -> Colors.White
                        }
                    )
                    .fontFamily(Res.Fonts.DM_SANS)
                    .fontWeight(FontWeight.Medium)
            )
        }

        /*val ctx = rememberPageContext()

        Div(HeadlineTextStyle.toAttrs()) {
            Button(
                onClick = {
                    ctx.router.navigateTo(Constants.RESUME_URL)
                },
                colorScheme = CustomColorSchemes.BlackAndWhite,
                size = ButtonSize.MD,
                modifier = ButtonStyle.toModifier().width(150.percent).margin(top = 70.px)
            ) {
                SpanText(
                    text = Constants.RESUME,
                    modifier = Modifier.fontFamily(Res.Fonts.Tauri)
                )
            }
        }*/
    }
}