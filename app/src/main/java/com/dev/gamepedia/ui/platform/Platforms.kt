package com.dev.gamepedia.ui.platform

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import com.dev.gamepedia.models.Platform
import com.dev.gamepedia.ui.theme.defaultPadding

@Composable
fun Platforms(platforms : List<Platform>){
    Row(horizontalArrangement = Arrangement.spacedBy(defaultPadding / 2)) {
        for(platform in platforms){
            Icon(imageVector = ImageVector.vectorResource(id = platform.icon),
                contentDescription = platform.slug)
        }
    }
}