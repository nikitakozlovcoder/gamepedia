package com.dev.gamepedia.ui.bottomNavigation

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.dev.gamepedia.R
import com.dev.gamepedia.constants.navigation.BottomNavigation
import com.dev.gamepedia.navigation.AppNavigationGraph
import com.dev.gamepedia.ui.theme.appColors

@Composable
fun BottomNavigationBar(navController: AppNavigationGraph, items: List<BottomNavigation>) {
    BottomNavigation(backgroundColor = MaterialTheme.appColors.backgroundSecondary) {
        for (item in items){
            val selected = navController.isActive(item).collectAsState(initial = false)
            BottomNavigationItem(
                onClick = {
                        navController.navigateTo(item)
                },
                icon = {
                    Icon(imageVector = ImageVector
                        .vectorResource(item.icon),
                        contentDescription = item.label,
                        tint = if (selected.value) {
                            MaterialTheme.appColors.accent
                        } else {
                            LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
                        }
                    )
                },
               selected = selected.value,
            )
        }
    }
}