package com.demo.portfolio_demo.components.sections

import androidx.compose.runtime.Composable
import com.demo.portfolio_demo.components.styles.ResearchStyle
import com.demo.portfolio_demo.components.widgets.SectionTitle
import com.demo.portfolio_demo.components.widgets.TrainingBlock
import com.demo.portfolio_demo.utils.Constants
import com.demo.portfolio_demo.utils.getAllTrainings
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem

@Composable
fun Training() {
    Column(
        modifier = ResearchStyle.toModifier().id("training")
            .then(Modifier.margin(top = 3.cssRem, bottom = 10.cssRem)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.TRAINING_TITLE)

        SimpleGrid(
            modifier = Modifier.fillMaxWidth().margin(top = 1.cssRem),
            numColumns = numColumns(base = 1)
        ) {

            val trainings = getAllTrainings()

            repeat(trainings.size) {
                TrainingBlock(training = trainings[it])
            }

        }
    }
}