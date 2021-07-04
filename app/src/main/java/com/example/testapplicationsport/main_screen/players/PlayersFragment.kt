package com.example.testapplicationsport.main_screen.players

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplicationsport.MenuFragment.Companion.sport
import com.example.testapplicationsport.databinding.FragmentPlayersBinding
import com.example.testapplicationsport.main_screen.players.adapter.PlayerAdapter
import com.example.testapplicationsport.main_screen.players.model.BasePlayers
import com.example.testapplicationsport.utiles.setupNavigationView

class PlayersFragment : Fragment() {

    private lateinit var binding: FragmentPlayersBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PlayerAdapter
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlayersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.setupNavigationView(binding.bottomNavigationView.bottomNavigationView)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerView = binding.playerRecycler
        adapter = PlayerAdapter()
        layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
        val listOfPlayers = BasePlayers().listOfPlayers
        listOfPlayers.forEach {
            if (it.sport == sport) {
                adapter.setPlayers(it)
            }
        }
    }

}