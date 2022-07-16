package com.dev.gamepedia.constants

sealed class ScoreConstants(){
    companion object{
        val GoodScore = (76..Int.MAX_VALUE)
        val MediumScore = (40..76)
        val BadScore = (Int.MIN_VALUE..40)
    }
}
