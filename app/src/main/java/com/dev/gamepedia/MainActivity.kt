package com.dev.gamepedia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.dev.gamepedia.ui.bottomNavigation.BottomNavigationBar
import com.dev.gamepedia.constants.navigation.BottomNavigation
import com.dev.gamepedia.ui.navigation.RootNavigation
import com.dev.gamepedia.ui.screens.HomeScreen
import com.dev.gamepedia.ui.theme.GamePediaTheme
import com.dev.gamepedia.ui.theme.defaultPadding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GamePediaTheme {
               Surface(color = MaterialTheme.colors.background) {
                    RootNavigation()
                }
                // A surface container using the 'background' color from the theme
            }
        }
    }
}

@Composable
@Preview
fun Preview(){
    GamePediaTheme {
        // A surface container using the 'background' color from the theme
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            backgroundColor = MaterialTheme.colors.background
        ) {
            HomeScreen()
        }
    }
}
