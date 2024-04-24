package com.example.etplayer.model.listMusic.model

import com.example.etplayer.model.musicmodel.Music

class ListMusics {

    fun getMusics(): List<Music>{

        val listei = listOf(
            Music(
                "Paris", "TCM",
                "https://www.youtube.com/watch?v=Kcz2BnDpUpA&pp=ygUdcGFyaXMgdGhlIGNoYWluc21va2VycyBseXJpY3M%3D",
                35000
            )
        )
        val sizeInt = listei.size
        return listei
    }
}
/*
Music(
"Paris", "TCM",
"https://www.youtube.com/watch?v=Kcz2BnDpUpA&pp=ygUdcGFyaXMgdGhlIGNoYWluc21va2VycyBseXJpY3M%3D",
35000
)*/
