package com.dev.gamepedia.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dev.gamepedia.constants.navigation.NavigationRoutes
import com.dev.gamepedia.navigation.AppNavigationGraph
import com.dev.gamepedia.ui.screens.GenreScreen
import com.dev.gamepedia.ui.screens.GenresScreen
import com.dev.gamepedia.ui.screens.HomeScreen
val LocalAppNavigationGraph = staticCompositionLocalOf<AppNavigationGraph?> { null }

@Composable
fun RootNavigation() {
    val controller = rememberNavController()
    CompositionLocalProvider(LocalAppNavigationGraph provides AppNavigationGraph(controller)){
        NavHost(navController = controller,
            startDestination = NavigationRoutes.HOME){

            composable(NavigationRoutes.HOME){
                HomeScreen()
            }

            composable(NavigationRoutes.GENRES_LIST){
                GenresScreen()
            }

            composable(NavigationRoutes.GENRE_GAMES_GenreId){
                GenreScreen()
            }
        }
    }

}