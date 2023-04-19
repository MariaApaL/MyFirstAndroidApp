package com.apa.accenture.myfirstapp.ui.view.favourites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apa.accenture.myfirstapp.R
import com.apa.accenture.myfirstapp.databinding.ActivityFavCatBinding
import com.apa.accenture.myfirstapp.databinding.ActivityMenuBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavCatActivity : AppCompatActivity() {

    private lateinit var binding:ActivityFavCatBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavCatBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}