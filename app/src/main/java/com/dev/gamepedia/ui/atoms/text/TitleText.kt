package com.dev.gamepedia.ui.atoms.text

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TitleText(text: String, modifier: Modifier = Modifier, textAlight: TextAlign? = null) {
    Text(
        text = text,
        modifier = modifier,
        style = MaterialTheme.typography.h6,
        fontWeight = FontWeight.Bold,
        textAlign = textAlight
    )
}