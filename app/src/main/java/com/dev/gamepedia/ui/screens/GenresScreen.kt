package com.dev.gamepedia.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dev.gamepedia.ui.appBar.LiteAppBar
import com.dev.gamepedia.ui.genreCard.GenreCard
import com.dev.gamepedia.ui.navigation.LocalAppNavigationGraph
import com.dev.gamepedia.ui.scaffold.BaseAppScaffold
import com.dev.gamepedia.ui.theme.defaultPadding

@Composable
fun GenresScreen() {
    val appNavigationGraph = LocalAppNavigationGraph.current!!

    BaseAppScaffold {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = defaultPadding)
                .verticalScroll(state = rememberScrollState())
        ) {
            LiteAppBar(
                title = "Genres",
                text = "Explore variety of genres"
            )
            Spacer(modifier = Modifier.height(defaultPadding * 3))
            Column(verticalArrangement = Arrangement.spacedBy(defaultPadding)) {
               GenreCard(){
                   appNavigationGraph.navigateToGenre(1)
               }
               GenreCard(){
                   appNavigationGraph.navigateToGenre(2)
               }
               GenreCard(){
                   appNavigationGraph.navigateToGenre(3)
               }
               GenreCard(){
                   appNavigationGraph.navigateToGenre(4)
               }
            }
            Spacer(modifier = Modifier.height(defaultPadding * 2))
        }
    }
}