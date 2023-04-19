package com.apa.accenture.myfirstapp.ui.view.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apa.accenture.myfirstapp.databinding.ActivityCatDetailsBinding
import com.apa.accenture.myfirstapp.databinding.ActivitySearchCatBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CatDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCatDetailsBinding

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}