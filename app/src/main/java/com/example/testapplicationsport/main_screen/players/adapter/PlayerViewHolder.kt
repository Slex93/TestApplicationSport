package com.example.testapplicationsport.main_screen.players.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.testapplicationsport.databinding.ItemPlayersBinding
import com.example.testapplicationsport.main_screen.players.model.Player
import com.example.testapplicationsport.utiles.downloadAndSet

class PlayerViewHolder(private val binding: ItemPlayersBinding):
    RecyclerView.ViewHolder(binding.root) {

        fun bind(player: Player){
            binding.itemPlayerImage.downloadAndSet(player.url)
            binding.itemPlayerName.text = player.name
            binding.itemPlayerSport.text = player.sport
        }
}