package com.example.testapplicationsport.main_screen

import android.graphics.Color
import android.os.Bundle
import android.transition.TransitionInflater
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.setupWithNavController
import com.example.testapplicationsport.MenuFragment.Companion.sport
import com.example.testapplicationsport.R
import com.example.testapplicationsport.databinding.FragmentRulesBinding
import com.example.testapplicationsport.utiles.setupNavigationView
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback


class RulesFragment : Fragment(){

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
        binding.rulesCardView.transitionName = sport
        this.setupNavigationView(binding.bottomNavigationView)
        when(sport){
            getString(R.string.transition_football)->{
                binding.rulesText.text = getString(R.string.rules_football)
            }
            getString(R.string.transition_basketball)->{
                binding.rulesText.text = getString(R.string.rules_basketbool)
            }
        }
    }

}