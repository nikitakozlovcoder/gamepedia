package com.dev.gamepedia.ui.atoms.text

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun OverlineText(text: String, modifier: Modifier = Modifier ) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.overline
    )
}