package com.example.testapplicationsport.main_screen

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.setupWithNavController
import com.example.testapplicationsport.R
import com.example.testapplicationsport.databinding.FragmentRulesBinding
import com.google.android.material.transition.MaterialContainerTransform


class RulesFragment : Fragment() {

    private lateinit var binding: FragmentRulesBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.nav_host_fragment
            duration = 1000
            scrimColor = Color.TRANSPARENT
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRulesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment =
            ((activity as AppCompatActivity).supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment)
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)

        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        try {
            val args: RulesFragmentArgs by navArgs()
            binding.rulesCardView.transitionName = args.transitionName
        } catch (e:Exception){
            Log.i("Exception:", e.message.toString())
        }

    }
}