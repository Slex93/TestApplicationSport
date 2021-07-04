package com.example.testapplicationsport.main_screen.gallery.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.testapplicationsport.databinding.ItemRecyclerGalleryBinding
import com.example.testapplicationsport.main_screen.gallery.model.Gallery
import com.example.testapplicationsport.utiles.downloadAndSet

class GalleryViewHolder(private val binding: ItemRecyclerGalleryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(image: Gallery) {
        binding.itemGalleryImage.downloadAndSet(image.url)
    }
}