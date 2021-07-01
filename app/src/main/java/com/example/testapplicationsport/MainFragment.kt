package com.example.testapplicationsport

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.testapplicationsport.databinding.FragmentMainBinding
import com.google.android.material.transition.MaterialContainerTransform


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var transitionName: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val args: MainFragmentArgs by navArgs()
        transitionName = args.transition
        binding.root.transitionName = transitionName
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedElementEnterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.nav_host_fragment
            duration = 700
            scrimColor = Color.TRANSPARENT
        }
    }
}