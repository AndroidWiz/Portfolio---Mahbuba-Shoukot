package com.demo.portfolio_demo.components.styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val CoActivityStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .minHeight(100.vh)
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .fontSize(2.75.cssRem)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
    }
}

val CoActivityItemTitleStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Small).lineHeight(12.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(22.px).lineHeight(22.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(22.px).lineHeight(22.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(22.px).lineHeight(22.px)
    }
}