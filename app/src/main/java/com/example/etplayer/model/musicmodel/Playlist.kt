package com.example.etplayer.model.musicmodel

import androidx.annotation.DrawableRes

data class Playlist(
    val id: Int,
    @DrawableRes val capa: Int,
    val title: String,
    val artista: String
)
