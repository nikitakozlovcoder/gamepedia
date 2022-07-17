package com.dev.gamepedia.ui.bottomNavigation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.dev.gamepedia.R
import com.dev.gamepedia.constants.navigation.BottomNavigation
import com.dev.gamepedia.ui.theme.appColors

@Composable
fun BottomNavigationBar(navController: NavHostController, items: List<BottomNavigation>) {
    BottomNavigation(backgroundColor = MaterialTheme.appColors.backgroundSecondary) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        for (item in items){
            val selected = currentDestination?.hierarchy?.any { it.route == item.route } == true
            BottomNavigationItem(
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(imageVector = ImageVector
                        .vectorResource(item.icon),
                        contentDescription = item.label,
                        tint = if (selected) {
                            MaterialTheme.appColors.accent
                        } else {
                            LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
                        }
                    )
                },
               selected = selected,
            )
        }
    }
}