package com.dev.gamepedia.models

import androidx.annotation.DrawableRes
import com.dev.gamepedia.R

sealed class Platform(val slug: String, @DrawableRes val icon: Int){
    object Windows: Platform("windows", R.drawable.ic_windows)
    object Linux: Platform("linux",  R.drawable.ic_linux)
    object Playstation: Platform("playstation", R.drawable.ic_ps)
    object Xbox: Platform("xbox", R.drawable.ic_xbox)
    object Nintendo: Platform("nintendo", R.drawable.ic_nintendo)
}
