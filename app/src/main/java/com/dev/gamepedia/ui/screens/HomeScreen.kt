package com.dev.gamepedia.ui.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dev.gamepedia.ui.appBar.LiteAppBar
import com.dev.gamepedia.ui.atoms.text.TitleText
import com.dev.gamepedia.ui.gameCard.GameCard
import com.dev.gamepedia.ui.gameCard.GameCardSlim
import com.dev.gamepedia.ui.scaffold.BaseAppScaffold
import com.dev.gamepedia.ui.theme.defaultPadding

@Composable
fun HomeScreen(){
    BaseAppScaffold() {
        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(state = rememberScrollState())) {
            Column(modifier = Modifier.padding(horizontal = defaultPadding)) {
                LiteAppBar(
                    title = "New and trending",
                    text = "Based on player counts and release date"
                )
                Spacer(modifier = Modifier.height(defaultPadding * 3))
                Column(verticalArrangement = Arrangement.spacedBy(defaultPadding)) {
                    GameCard()
                    GameCard()
                    GameCard()
                    GameCard()
                }
                Spacer(modifier = Modifier.height(defaultPadding*2))
                TitleText(text = "Last updated")
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(defaultPadding),
                modifier = Modifier
                    .padding(start = defaultPadding, top = defaultPadding)
                    .horizontalScroll(state = rememberScrollState())) {
                GameCardSlim("God of War: Ragnarok")
                GameCardSlim("Elden Ring")
                GameCardSlim("Monster Hunter: World")
                Spacer(modifier = Modifier.width(defaultPadding))
            }
            Spacer(modifier = Modifier.height(defaultPadding * 2))
        }
    }

}