package com.app.diario

import Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.diario.components.CardDiario
import com.app.diario.components.PrimaryButton
import com.app.diario.theme.Emerald400
import com.app.diario.theme.Emerald500
import com.app.diario.theme.Zinc200
import com.app.diario.theme.Zinc400
import com.app.diario.theme.Zinc50
import com.app.diario.theme.Zinc500
import com.app.diario.theme.Zinc800
import com.app.diario.theme.Zinc900
import com.app.diario.theme.Zinc950

@Suppress("ktlint:standard:function-naming")
@Composable
@Preview
fun App() {
    val isDarkMode = isSystemInDarkTheme()

    Theme(
        isDarkMode,
    ) {
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .systemBarsPadding()
                    .padding(24.dp),
        ) {
            Column(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp), // Espaçamento entre os cards
            ) {
                CardDiario(
                    title = "21/01/2004",
                    content = "Esse foi um dia lindo de ser ver",
                    onClick = { },
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Text(
                    text = "Um limão, mil limões, um milhão de limões.",
                    color = MaterialTheme.colorScheme.onBackground,
                )

                PrimaryButton(
                    text = "Reuseble button",
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}
