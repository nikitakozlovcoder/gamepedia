package com.dev.gamepedia.ui.atoms.gradient

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun BaseGradient(modifier: Modifier = Modifier) {
   Box(modifier = modifier
       .background(brush = Brush.verticalGradient(
            0f to Color.DarkGray.copy(alpha = 0.3f),
            0.3f to Color.DarkGray.copy(alpha = 0.8f),
            1f to Color(0xEE312623)
       ))
   )
}