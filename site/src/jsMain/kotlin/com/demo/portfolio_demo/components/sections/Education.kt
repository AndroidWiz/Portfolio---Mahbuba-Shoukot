package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.SectionDescriptionStyle
import com.demo.portfolio_demo.components.styles.WritingsStyle
import com.demo.portfolio_demo.components.widgets.EducationBlock
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.components.widgets.WorkExperienceBlock
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.Res
import com.demo.portfolio_demo.utils.getAllEducation
import com.demo.portfolio_demo.utils.getAllWorkExperience
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Education() {
    Column(
        modifier = WritingsStyle.toModifier().id("education"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.EDUCATION_TITLE)

        SpanText(
            text = Constants.EDUCATION_SECTION_TITLE,
            modifier = SectionDescriptionStyle.toModifier()
                .textAlign(TextAlign.Center)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Colors.Gray
                        ColorMode.DARK -> Colors.DimGray
                    }
                )
                .fontFamily(Res.Fonts.DM_SANS)
        )

        SimpleGrid(
            numColumns = numColumns(base = 1),
            modifier = Modifier.margin(top = 1.5.cssRem, bottom = 2.cssRem)
        ) {
            val education = getAllEducation()

            repeat(education.size) {
                EducationBlock(education = education[it])
            }
        }
    }
}