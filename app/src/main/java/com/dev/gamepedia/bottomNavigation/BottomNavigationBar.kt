package com.dev.gamepedia.bottomNavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.dev.gamepedia.R
import com.dev.gamepedia.ui.theme.appColors

@Composable
@Preview
fun BottomNavigationBar(){
    BottomNavigation(backgroundColor = MaterialTheme.appColors.backgroundSecondary) {
        BottomNavigationItem(
            onClick = {},
            icon = {
                Icon(imageVector = ImageVector
                    .vectorResource(R.drawable.ic_baseline_format_list_bulleted_24),
                    contentDescription = null
                )
            },
            selected = false
        )

        BottomNavigationItem(
            onClick = {},
            icon = {
                Icon(imageVector = ImageVector
                    .vectorResource(R.drawable.ic_baseline_home_24),
                    contentDescription = null,
                    tint = MaterialTheme.appColors.accent
                )
            },
            selected = true
        )
    }
}