package com.example.testapplicationsport.main_screen.gallery.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplicationsport.databinding.ItemRecyclerGalleryBinding
import com.example.testapplicationsport.main_screen.gallery.model.Gallery

class GalleryAdapter : RecyclerView.Adapter<GalleryViewHolder>() {

    private val listOfImages = mutableListOf<Gallery>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRecyclerGalleryBinding.inflate(inflater, parent, false)
        return GalleryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.bind(listOfImages[position])
    }

    override fun getItemCount(): Int = listOfImages.size

    fun addItem(image: Gallery) {
        listOfImages.add(image)
        notifyItemChanged(listOfImages.size)
    }
}