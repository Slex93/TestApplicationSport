package com.example.testapplicationsport.utiles

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testapplicationsport.R

fun ImageView.downloadAndSet(url: String) {
    val into = Glide.with(this)
        .load(url)
        .apply(RequestOptions.placeholderOf(R.drawable.splash_screen))
        .into(this)
}