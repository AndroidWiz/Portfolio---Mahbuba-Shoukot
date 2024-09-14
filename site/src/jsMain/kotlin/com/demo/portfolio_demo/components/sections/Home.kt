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
import com.demo.portfolio_demo.components.widgets.PhotographImage
import com.demo.portfolio_demo.toSitePalette
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
import com.varabyte.kobweb.silk.components.animation.toAnimation
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toAttrs
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import org.jetbrains.compose.web.dom.Div

@Composable
fun Home() {
    Box(
        modifier = HeroSectionStyle.toModifier().animation(
            HeroContainerKeyFrames.toAnimation(
                duration = 1.s,
                timingFunction = AnimationTimingFunction.EaseInOut
            )
        ),
//        contentAlignment = Alignment.CenterStart
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
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
                    SubheadlineTextStyle.toModifier().margin(top = 20.px).toAttrs()
                ) {
                    SpanText(
                        text = Constants.AND_NICE_TO_MEET_YOU,
                        modifier = UsersMessageStyle.toModifier()
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Colors.Gray
                                    ColorMode.DARK -> Colors.DimGray
                                }
                            )
                            .fontFamily(Res.Fonts.DM_SANS)
                    )
                }

                val ctx = rememberPageContext()

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
                }
            }

            // Image
            CircleImage(modifier = Modifier.size(250.px), src = Res.Images.MY_IMAGE)
        }

    }
}