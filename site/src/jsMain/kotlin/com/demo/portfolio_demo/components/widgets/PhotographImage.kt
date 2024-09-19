package com.demo.portfolio_demo.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun PhotographImage(
    modifier: Modifier = Modifier,
    src: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth().then(modifier)
            .padding(all = 6.px),
        contentAlignment = Alignment.Center
    ) {
        Image(
            src = src,
            modifier = Modifier
//                .widthIn(max = 200.px)
//                .heightIn(max = 200.px)
//                .size(200.px)
                .fillMaxWidth()
                .borderRadius(10.px).display(DisplayStyle.Block)
                .heightIn(max = 250.px)
//                .objectFit(ObjectFit.Cover) // TODO: works okay I guess
//                .fillMaxHeight()
        )
    }
}

@Composable
fun CircleImage(
    modifier: Modifier = Modifier,
    src: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth().then(modifier)
            .padding(all = 6.px),
        contentAlignment = Alignment.Center
    ) {
        Image(
            src = src,
//            modifier = Modifier.fillMaxWidth().borderRadius(50.percent)
            modifier = Modifier.fillMaxWidth().borderRadius(10.px)
                .display(DisplayStyle.Block).fillMaxHeight()
        )
    }
}