package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.ExperienceStyle
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.components.widgets.WorkExperienceBlock
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.getAllWorkExperience
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Experience() {
    Column(
        modifier = ExperienceStyle.toModifier().id("experience"),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        SectionTitle(Constants.EXPERIENCE_TITLE)

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 3),
            modifier = Modifier.margin(top = 3.cssRem, bottom = 4.cssRem)
        ) {
            val workExperiences = getAllWorkExperience()

            repeat(workExperiences.size) {
                WorkExperienceBlock(workExperience = workExperiences[it])
            }
        }
    }
}