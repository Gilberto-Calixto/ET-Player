package com.example.etplayer.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.etplayer.R
import com.example.etplayer.model.listMusic.model.ListMusics
import com.example.etplayer.model.musicmodel.Music

class MusicAdapter(private val context: Context,
    private val listaMusics: ListMusics
): RecyclerView.Adapter<MusicAdapter.SongViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_playlist, parent, false)
        return SongViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val itemCurrent = listaMusics.getMusics().get(position)
        holder.bind(itemCurrent)
    }

    override fun getItemCount(): Int {
        return listaMusics.getMusics().size
    }

    inner class SongViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(item: Music){


        }
    }


}