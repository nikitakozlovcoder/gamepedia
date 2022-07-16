package com.dev.gamepedia.ui.gameCard

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.gamepedia.constants.ScoreConstants
import com.dev.gamepedia.ui.theme.appColors
import com.dev.gamepedia.ui.theme.defaultPadding

@Composable
fun GameScore(rating: Int) {

    @Composable
    fun GetColor(): Color{
        return when (rating){
            in ScoreConstants.BadScore -> MaterialTheme.appColors.badScore
            in ScoreConstants.MediumScore -> MaterialTheme.appColors.mediumScore
            in ScoreConstants.GoodScore -> MaterialTheme.appColors.goodScore
            else -> Color.White
        }
    }

    Surface(
        modifier = Modifier.width(30.dp)
                .border(BorderStroke(1.dp, GetColor().copy(alpha = 0.4f))
        ),
        color = Color.Transparent,
        shape = MaterialTheme.shapes.medium
    ){
        Column(Modifier.padding(defaultPadding / 4).fillMaxWidth()) {
            Text(text = rating.toString(),
                modifier = Modifier.fillMaxWidth(),
                color = GetColor(),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 14.sp)
        }
    }
}