package com.demo.portfolio_demo.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import com.demo.portfolio_demo.components.sections.Footer
import com.demo.portfolio_demo.components.sections.NavHeader
import com.demo.portfolio_demo.components.widgets.AppearanceAwareImage
import com.demo.portfolio_demo.components.widgets.BackToTopButton
import com.demo.portfolio_demo.components.widgets.MyHomeImage
import com.demo.portfolio_demo.utils.Res
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

val PageContentStyle = CssStyle {
    base { Modifier.fillMaxSize().padding(leftRight = 2.cssRem, top = 4.cssRem) }
    Breakpoint.MD { Modifier.maxWidth(60.cssRem) }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
fun SVGBackgroundImage(modifier: Modifier) {
    MyHomeImage(
        src = Res.Images.MY_IMAGE,
        modifier = modifier.margin(top = 5.cssRem),
//        width = 60,
//        height = 60
    )
}

@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {

    val breakpoint = rememberBreakpoint()

    val cursor = if (ColorMode.current.isDark) {
        Res.Images.CUSTOM_CURSOR_DARK
    } else {
        Res.Images.CUSTOM_CURSOR_LIGHT
    }

    LaunchedEffect(title) {
        document.title = "Mahbuba Shoukot"
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .styleModifier {
                property("cursor", "url('$cursor'), auto")
            }
            // Create a box with two rows: the main content (fills as much space as it can) and the footer (which reserves
            // space at the bottom). "min-content" means the use the height of the row, which we use for the footer.
            // Since this box is set to *at least* 100%, the footer will always appear at least on the bottom but can be
            // pushed further down if the first row grows beyond the page.
            // Grids are powerful but have a bit of a learning curve. For more info, see:
            // https://css-tricks.com/snippets/css/complete-guide-grid/
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.Center
    ) {
//        SVGBackgroundImage(Modifier.align(Alignment.TopEnd).pointerEvents(PointerEvents.None).width(40.percent).minWidth(30.vw).styleModifier { property("height", "auto") })


        Column(
            // Isolate the content, because otherwise the absolute-positioned SVG above will render on top of it.
            // This is confusing but how browsers work. Read up on stacking contexts for more info.
            // https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_positioned_layout/Understanding_z-index/Stacking_context
            // Some people might have used z-index instead, but best practice is to avoid that if possible, because
            // as a site gets complex, Z-fighting can be a huge pain to track down.
            Modifier.fillMaxSize().gridRow(1),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                PageContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                content()
            }
            BackToTopButton()
        }
        NavHeader(modifier = Modifier.position(Position.Fixed).top(0.px))
        // Associate the footer with the row that will get pushed off the bottom of the page if it can't fit.
        Footer(breakpoint, Modifier.fillMaxWidth().gridRow(2))
    }
}
