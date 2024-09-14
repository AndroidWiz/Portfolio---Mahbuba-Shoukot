package com.demo.portfolio_demo.components.widgets

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.model.EducationData
import com.demo.portfolio_demo.components.styles.WorkExperienceItemOrgStyle
import com.demo.portfolio_demo.components.styles.WorkExperienceItemRoleAndDurationStyle
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Span

@Composable
fun EducationBlock(
    modifier: Modifier = Modifier,
    education: EducationData
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth().padding(leftRight = 0.5.cssRem).fontFamily(Res.Fonts.DM_SANS)
            .margin(leftRight = 0.5.cssRem)
            .then(modifier)
    ) {

        Row(
            modifier = modifier.align(Alignment.TopStart)
        ) {

            Column(
                modifier = modifier.align(Alignment.CenterVertically)
            ) {
                Span(
                    attrs = modifier
                        .position(Position.Relative)
                        .display(DisplayStyle.Block)
                        .size(16.px)
                        .backgroundColor(
                            when (ColorMode.current) {
                                ColorMode.LIGHT -> Colors.Gray
                                ColorMode.DARK -> Colors.DimGray
                            }
                        )
                        .borderRadius(50.percent)
                        .margin(top = 1.5.cssRem)
//                        .margin(top = 3.cssRem)
                        .toAttrs()
                )
                Span(
                    attrs = modifier
                        .display(DisplayStyle.InlineBlock)
                        .width(2.px)
                        .height(90.px)
                        .backgroundColor(
                            when (ColorMode.current) {
                                ColorMode.LIGHT -> Colors.Gray
                                ColorMode.DARK -> Colors.DimGray
                            }
                        )
                        .transform { translate(7.px, 0.px) }
                        .toAttrs()
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(leftRight = 0.5.cssRem)
//                    .margin(top = 1.75.cssRem)
                    .margin(top = 2.cssRem)
//                    .padding(leftRight = 24.px),
//                    .padding(top = 30.px, bottom = 24.px, leftRight = 24.px),
                    .padding(top = 20.px ,bottom = 10.px, leftRight = 24.px),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                SpanText(
                    text = education.institution,
                    modifier = WorkExperienceItemRoleAndDurationStyle.toModifier()
                        .fillMaxWidth()
                        .color(
                            when (ColorMode.current) {
                                ColorMode.LIGHT -> Colors.Gray
                                ColorMode.DARK -> Colors.DimGray
                            }
                        )
                        .fontWeight(FontWeight.Bold)
                )
                SpanText(
                    text = education.degree,
                    modifier = WorkExperienceItemOrgStyle.toModifier()
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
                    text = education.duration,
                    modifier = WorkExperienceItemRoleAndDurationStyle.toModifier()
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
        }

    }
}