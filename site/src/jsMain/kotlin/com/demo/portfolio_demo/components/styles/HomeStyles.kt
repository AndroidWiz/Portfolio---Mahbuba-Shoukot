package com.demo.portfolio_demo.components.styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh

val HeroSectionStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
            .height(100.vh)
            .grid {  }
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .height(75.vh)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .fontSize(2.5.cssRem)
            .height(75.vh)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .fontSize(2.75.cssRem)
            .height(80.vh)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .fontSize(3.cssRem)
//            .height(100.vh)
            .height(80.vh)
    }
}

val HelloImStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Medium).margin(top = 2.cssRem)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XXLarge)
    }
}

val UserNameStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.XXLarge)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Larger)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Larger)
    }
}

val UsersMessageStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Medium)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XLarge)
    }
}

val HeroContainerKeyFrames = Keyframes {
    0.percent {
        Modifier
            .margin(top = 50.px)
            .opacity(0)
    }
    100.percent {
        Modifier
            .margin(top = 0.px)
            .opacity(1)
    }
}