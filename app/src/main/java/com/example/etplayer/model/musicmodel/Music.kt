package com.example.etplayer.model.musicmodel

import androidx.annotation.DrawableRes
import java.time.Duration

data class Music(
    val title: String,
    val artist: String,
    val urlMusic: String,
    val duration: Long
)
