package com.dev.gamepedia.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dev.gamepedia.constants.navigation.NavigationRoutes
import com.dev.gamepedia.ui.scaffold.BaseAppScaffold
import com.dev.gamepedia.ui.screens.GenresScreen
import com.dev.gamepedia.ui.screens.HomeScreen
val LocalRootNavController = staticCompositionLocalOf<NavHostController?> { null }

@Composable
fun RootNavigation() {
    CompositionLocalProvider(LocalRootNavController provides rememberNavController()){
        NavHost(navController = LocalRootNavController.current!!, startDestination = NavigationRoutes.HOME){
            composable(NavigationRoutes.HOME){
                HomeScreen()
            }

            composable(NavigationRoutes.GENRES_LIST){
                GenresScreen()
            }
        }
    }

}