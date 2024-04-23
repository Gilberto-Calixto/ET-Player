package com.example.etplayer.model.musicmodel

data class Playlist(
    val id: Int,
    val title: String,
    val songs: List<Music>
)
