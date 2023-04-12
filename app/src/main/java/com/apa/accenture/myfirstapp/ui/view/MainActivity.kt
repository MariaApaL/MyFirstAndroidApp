package com.apa.accenture.myfirstapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apa.accenture.myfirstapp.R
import com.apa.accenture.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        TODO("Not yet implemented")
    }
}