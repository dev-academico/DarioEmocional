package com.app.diario

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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

private val LightColors =
    lightColorScheme(
        primary = Emerald500,
        onPrimary = Zinc50,
        background = Zinc50,
        onBackground = Zinc900,
        surfaceVariant = Zinc200,
        onSurfaceVariant = Zinc500,
    )

private val DarkColors =
    darkColorScheme(
        primary = Emerald400,
        onPrimary = Zinc900,
        background = Zinc950,
        onBackground = Zinc50,
        surfaceVariant = Zinc800,
        onSurfaceVariant = Zinc400,
    )

@Suppress("ktlint:standard:function-naming")
@Composable
@Preview
fun App() {
    val isDarkMode = isSystemInDarkTheme()

    val colorScheme = if (isDarkMode) DarkColors else LightColors

    MaterialTheme(colorScheme = colorScheme) {
        Column(
            modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background).systemBarsPadding(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Um limão, mil limões, um milhão de limões.",
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(horizontal = 24.dp),
            )

            PrimaryButton(
                text = "Reuseble button",
                onClick = { },
                modifier = Modifier.fillMaxWidth().padding(24.dp),
            )
        }
    }
}
