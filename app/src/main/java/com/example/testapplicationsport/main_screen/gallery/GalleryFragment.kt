package com.example.testapplicationsport.main_screen.gallery

import android.os.Bundle
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
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.testapplicationsport.MenuFragment.Companion.sport
import com.example.testapplicationsport.R
import com.example.testapplicationsport.databinding.FragmentGalleryBinding
import com.example.testapplicationsport.main_screen.gallery.adapter.GalleryAdapter
import com.example.testapplicationsport.main_screen.gallery.model.BaseGallery
import com.example.testapplicationsport.utiles.setupNavigationView

class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: GalleryAdapter
    private lateinit var layoutManager: StaggeredGridLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.setupNavigationView(binding.bottomNavigationView)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerView = binding.galleryRecycler
        adapter = GalleryAdapter()
        layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        BaseGallery().listOfImages.forEach {
            if (it.sport == sport){
                adapter.addItem(it)
            }
        }
    }

}