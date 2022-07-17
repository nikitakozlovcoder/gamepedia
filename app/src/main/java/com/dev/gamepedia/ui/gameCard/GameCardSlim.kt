package com.dev.gamepedia.ui.gameCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.dev.gamepedia.R
import com.dev.gamepedia.ui.atoms.gradient.BaseGradient
import com.dev.gamepedia.ui.atoms.text.OverlineText
import com.dev.gamepedia.ui.atoms.text.TitleText
import com.dev.gamepedia.ui.theme.defaultPadding
import com.dev.gamepedia.ui.theme.defaultRoundedShape

@Composable

fun GameCardSlim (text: String) {
    Card(
        shape = defaultRoundedShape,
        modifier = Modifier.clickable {  }
    ) {
        Box(
            modifier = Modifier.width(300.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.cardbg),
                contentDescription = null,
                modifier = Modifier
                    .matchParentSize(),
                contentScale = ContentScale.Crop,
            )
            BaseGradient(modifier = Modifier.matchParentSize())
            Column(
                modifier = Modifier
                    .padding(defaultPadding)
                    .defaultMinSize(minHeight = 150.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                TitleText(text = text)
                OverlineText(text = "May 17, 2022")
            }
        }
    }
}