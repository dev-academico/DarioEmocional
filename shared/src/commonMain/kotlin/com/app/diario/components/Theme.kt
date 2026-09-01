import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
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

@Composable
fun Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        content = content,
    )
}
