package com.example.etplayer.model.musicmodel

import java.time.Duration

data class Music(
    val title: String,
    val artist: String,
    val album: Int,
    val duration: Duration
)
