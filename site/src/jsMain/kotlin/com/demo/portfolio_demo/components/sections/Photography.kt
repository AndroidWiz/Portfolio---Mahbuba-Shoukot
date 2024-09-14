package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.ExperienceStyle
import com.demo.portfolio_demo.components.widgets.PhotographImage
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.getAllPhotographs
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun Photography() {
    Column(
        modifier = ExperienceStyle.toModifier().id("photography"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.PHOTOGRAPH_TITLE)

//        SimpleGrid(modifier = Modifier.margin(top = 30.px),numColumns = numColumns(base = 1, sm = 2, md = 4, lg = 6)) {
        SimpleGrid(modifier = Modifier.margin(top = 30.px),numColumns = numColumns(base = 1, sm = 4, md = 4, lg = 4)) {

            val allPhotographs = getAllPhotographs()

            repeat(allPhotographs.size) {
                PhotographImage(src = allPhotographs[it])
            }
        }
    }
}