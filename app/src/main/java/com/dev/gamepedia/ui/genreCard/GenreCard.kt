package com.dev.gamepedia.ui.genreCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.gamepedia.R
import com.dev.gamepedia.ui.atoms.gradient.BaseGradient
import com.dev.gamepedia.ui.atoms.text.TitleText
import com.dev.gamepedia.ui.theme.appColors
import com.dev.gamepedia.ui.theme.defaultPadding
import com.dev.gamepedia.ui.theme.defaultRoundedShape

@Composable
fun GenreCard(onClick: () -> Unit){
    Card(
        modifier = Modifier
            .clickable {
                onClick()
            }
            .height(180.dp)
            .fillMaxWidth(),
        shape = defaultRoundedShape,
        backgroundColor = MaterialTheme.appColors.backgroundSecondary
    ) {
        Box(modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.action),
                contentDescription = null,
                modifier = Modifier
                    .matchParentSize(),
                contentScale = ContentScale.Crop,
            )
            BaseGradient(modifier = Modifier.matchParentSize())
            Column(
                modifier = Modifier
                    .padding(defaultPadding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TitleText(text = "Action", color = Color.White, underline = true)
                Text(text = "15,461 Games", color = Color.White)
            }
        }
    }
}