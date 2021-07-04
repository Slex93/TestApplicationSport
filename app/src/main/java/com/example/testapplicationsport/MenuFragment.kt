package com.example.testapplicationsport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.testapplicationsport.databinding.FragmentMenuBinding
import com.example.testapplicationsport.utiles.downloadAndSet

class MenuFragment : Fragment(), View.OnClickListener {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        setPrimaryImages()
        binding.mainCardFootball.setOnClickListener(this)
        binding.mainCardBasketball.setOnClickListener(this)
        return binding.root
    }

    private fun setPrimaryImages() {
        val urlBasketball = getString(R.string.menu_basketball_url)
        val urlFootball = getString(R.string.menu_football_url)
        binding.mainImageBasketball.downloadAndSet(urlBasketball)
        binding.mainImageFootball.downloadAndSet(urlFootball)
    }

    override fun onClick(v: View) {
        val directions = MenuFragmentDirections.actionNavMenuToNavRules(v.transitionName)
        val extras = FragmentNavigatorExtras(v to v.transitionName)
        sport = v.transitionName
        findNavController().navigate(directions, extras)
    }

    companion object {
        var sport: String = ""
    }

}