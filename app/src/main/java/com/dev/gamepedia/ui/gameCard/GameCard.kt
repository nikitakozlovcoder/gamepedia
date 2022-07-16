package com.dev.gamepedia.ui.gameCard

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.gamepedia.R
import com.dev.gamepedia.models.Platform
import com.dev.gamepedia.ui.platform.Platforms
import com.dev.gamepedia.ui.theme.appColors
import com.dev.gamepedia.ui.theme.cardInnerHorizontalPadding
import com.dev.gamepedia.ui.theme.defaultPadding
import org.intellij.lang.annotations.JdkConstants
import kotlin.random.Random

@Composable
fun GameCard() {
    Card(
        modifier = Modifier.clickable {  } ,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.appColors.backgroundSecondary
    ) {
        Column {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.card_image),
                contentDescription = "image"
            )
            Column(
                modifier = Modifier
                    .padding(
                        horizontal = cardInnerHorizontalPadding,
                        vertical = defaultPadding)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Platforms(listOf(Platform.Windows, Platform.Xbox))
                    GameScore(Random.nextInt(0, 100))
                }

                Spacer(modifier = Modifier.height(defaultPadding / 2))
                Text(
                    text = "The Stanley Parable: Ultra Deluxe",
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "View more",
                    style = MaterialTheme.typography.overline
                )
            }

        }
    }
}