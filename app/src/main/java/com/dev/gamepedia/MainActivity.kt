package com.dev.gamepedia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.gamepedia.bottomNavigation.BottomNavigationBar
import com.dev.gamepedia.ui.screens.HomeScreen
import com.dev.gamepedia.ui.theme.GamePediaTheme
import com.dev.gamepedia.ui.theme.defaultPadding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GamePediaTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = {
                        BottomNavigationBar()
                    },
                    modifier = Modifier
                        .fillMaxSize(),
                    backgroundColor = MaterialTheme.colors.background
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                        HomeScreen()
                    }
                }
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
