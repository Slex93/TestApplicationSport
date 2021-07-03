package com.example.testapplicationsport.utiles

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testapplicationsport.R
import com.google.android.material.bottomnavigation.BottomNavigationView

fun ImageView.downloadAndSet(url: String) {
    Glide.with(this)
        .load(url)
        .apply(RequestOptions.placeholderOf(R.drawable.ic_launcher_foreground))
        .into(this)
}

fun Fragment.setupNavigationView(navigationView: BottomNavigationView) {
    val navHostFragment =
        ((activity as AppCompatActivity)
            .supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment)
    val navController = navHostFragment.navController
    navigationView.setupWithNavController(navController)
}