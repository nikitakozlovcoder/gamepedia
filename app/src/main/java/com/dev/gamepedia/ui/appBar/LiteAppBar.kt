package com.dev.gamepedia.ui.appBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.dev.gamepedia.ui.theme.defaultPadding

@Composable
@Preview
fun LiteAppBar(){
    Column(
        modifier = Modifier.fillMaxWidth().padding(top = defaultPadding * 2),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = "New and trending",
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Based on player counts and release date")
    }
}