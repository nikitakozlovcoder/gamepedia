package com.dev.gamepedia.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dev.gamepedia.ui.appBar.LiteAppBar
import com.dev.gamepedia.ui.gameCard.GameCard
import com.dev.gamepedia.ui.theme.defaultPadding

@Composable
fun HomeScreen(){
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = defaultPadding)
            .verticalScroll(scrollState)) {
        LiteAppBar()
        Spacer(modifier = Modifier.height(defaultPadding * 3))
        Column(verticalArrangement = Arrangement.spacedBy(defaultPadding),
            modifier = Modifier.padding(bottom = defaultPadding)) {
            GameCard()
            GameCard()
            GameCard()
            GameCard()
        }
    }

}