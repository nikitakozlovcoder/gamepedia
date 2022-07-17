package com.dev.gamepedia.constants.navigation

import androidx.annotation.DrawableRes
import com.dev.gamepedia.R

sealed class BottomNavigation(val label: String, val route: String, @DrawableRes val icon: Int){
    object Home : BottomNavigation("Home",
        NavigationRoutes.HOME,
        R.drawable.ic_baseline_videogame_asset_24)
    object Genres : BottomNavigation("Genres",
        NavigationRoutes.GENRES_LIST,
        R.drawable.ic_baseline_format_list_bulleted_24)

    companion object{
        val navigationItems = listOf(Genres, Home)
    }
}
