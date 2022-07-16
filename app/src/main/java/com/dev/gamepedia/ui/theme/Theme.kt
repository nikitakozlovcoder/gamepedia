package com.dev.gamepedia.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val DarkColorPalette = AppColors(
    material = darkColors(
        background = backgroundColor,
        onSurface = textColorPrimary,
        onBackground = textColorPrimary,
        onSecondary = textColorPrimary,
        onPrimary = textColorPrimary,
    ),
    textSecondary = textColorSecondary,
    accent = accentColor,
    backgroundSecondary = backgroundSecondaryColor
    )

private val LightColorPalette = AppColors(
    material = lightColors(
        background = backgroundColor,
        onSurface = textColorPrimary,
        onBackground = textColorPrimary,
        onSecondary = textColorPrimary,
        onPrimary = textColorPrimary,
    ),
    textSecondary = textColorSecondary,
    accent = accentColor,
    backgroundSecondary = backgroundSecondaryColor
)


private val LocalColors = staticCompositionLocalOf { LightColorPalette }

val MaterialTheme.appColors: AppColors
    @Composable
    get() = LocalColors.current

@Composable
fun GamePediaTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    CompositionLocalProvider(LocalColors provides  colors) {
        MaterialTheme(
            colors = colors.material,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}