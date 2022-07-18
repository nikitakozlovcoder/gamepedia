package com.dev.gamepedia.ui.atoms.text

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration

@Composable
fun TitleText(text: String,
              modifier: Modifier = Modifier,
              textAlight: TextAlign? = null,
              color: Color = Color.Unspecified,
              underline: Boolean = false
            ) {

    val style = if (underline){
        MaterialTheme.typography.h6.copy(textDecoration = TextDecoration.Underline)
    }
    else {
        MaterialTheme.typography.h6
    }

    Text(
        color = color,
        text = text,
        modifier = modifier,
        style = style,
        fontWeight = FontWeight.Bold,
        textAlign = textAlight
    )
}