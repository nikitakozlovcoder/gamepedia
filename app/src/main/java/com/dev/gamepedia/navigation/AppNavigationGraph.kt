package com.dev.gamepedia.navigation

import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.dev.gamepedia.constants.navigation.BottomNavigation
import com.dev.gamepedia.constants.navigation.NavigationRoutes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AppNavigationGraph(private val navHostController: NavHostController) {

    fun isActive(node: BottomNavigation): Flow<Boolean> {
        return navHostController.currentBackStackEntryFlow.map { it ->
            val destination = it.destination

            if (node.children.any{ it == destination.route }){
                return@map true;
            }

            return@map destination.hierarchy.any {
                it.route == node.route
            }
        }
    }

    fun navigateTo(node: BottomNavigation){
        val route = navHostController.currentBackStackEntry?.destination?.route
        if (route == node.route || node.children.any{ it == route}){
            return
        }

        navHostController.navigate(node.route) {
            popUpTo(navHostController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    fun navigateToGenre(genreId: Int){
        val route = NavigationRoutes.GENRE_GAMES_GenreId
            .replaceFirst("{GenreId}", genreId.toString())
        navHostController.navigate(route)
    }
}