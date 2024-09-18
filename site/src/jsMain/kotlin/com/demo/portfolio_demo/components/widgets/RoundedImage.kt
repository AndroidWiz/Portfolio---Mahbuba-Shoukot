package com.demo.portfolio_demo.components.widgets

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.functions.max
import com.varabyte.kobweb.compose.css.functions.min
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun RoundedImage(
    modifier: Modifier = Modifier,
    src: String,
    navigateTo: String? = null
) {
    val ctx = rememberPageContext()

    Box(
        modifier = Modifier
//            .fillMaxSize()
//            .fillMaxWidth()
            .sizeIn(265.px)
//            .heightIn(min = 300.px, max = 300.px)
//            .padding(5.px)
            .margin(all = 10.px)
            .border(
                width = 2.px, style = LineStyle.Solid, color = when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.FOOTER_COLOR_LIGHT
                    ColorMode.DARK -> Res.Colors.FOOTER_COLOR_LIGHT
                }
            )
            .borderRadius(10.px).then(modifier).cursor(Cursor.Pointer)
            .onClick {
                navigateTo?.let {
                    ctx.router.navigateTo(it)
                }
            }
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
//                .height(300.px)
                .sizeIn(maxHeight = 265.px)
//                .fillMaxSize()
                .objectFit(ObjectFit.Inherit)
                .borderRadius(10.px),
            src = src
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .borderRadius(10.px)
                .styleModifier {
                    property(
                        "background",
                        "linear-gradient(180deg, rgba(0, 0, 0, 0.00) 50.52%, rgba(0, 0, 0, 0.71) 100%)"
                    )
                }
        ) {
            Image(
                src = Res.Images.TUMBLR_ROUND,
                modifier = Modifier.size(22.px)
                    .align(Alignment.BottomEnd)
                    .margin(bottom = 10.px, right = 10.px)
            )
        }
    }
}