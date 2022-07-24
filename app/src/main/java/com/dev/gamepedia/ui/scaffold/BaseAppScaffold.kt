package com.dev.gamepedia.ui.scaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dev.gamepedia.constants.navigation.BottomNavigation
import com.dev.gamepedia.ui.bottomNavigation.BottomNavigationBar
import com.dev.gamepedia.ui.navigation.LocalAppNavigationGraph

@Composable
fun BaseAppScaffold(content: @Composable () -> Unit ) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = LocalAppNavigationGraph.current!!, items = BottomNavigation.navigationItems)
        },
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = MaterialTheme.colors.background
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
            content()
        }
    }
}