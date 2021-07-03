package com.example.testapplicationsport.main_screen.players.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplicationsport.databinding.ItemPlayersBinding
import com.example.testapplicationsport.main_screen.players.model.Player

class PlayerAdapter: RecyclerView.Adapter<PlayerViewHolder>() {

    private var listOfPlayers = mutableListOf<Player>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPlayersBinding.inflate(inflater, parent, false)
        return PlayerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int){
        holder.bind(listOfPlayers[position])
    }

    override fun getItemCount(): Int = listOfPlayers.size

    fun setPlayers(player: Player){
        listOfPlayers.add(player)
        notifyItemChanged(listOfPlayers.size)
    }
}