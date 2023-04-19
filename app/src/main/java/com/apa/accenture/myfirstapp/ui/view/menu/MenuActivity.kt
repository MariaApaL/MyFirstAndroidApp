package com.apa.accenture.myfirstapp.ui.view.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apa.accenture.myfirstapp.databinding.ActivityMainBinding
import com.apa.accenture.myfirstapp.databinding.ActivityMenuBinding
import com.apa.accenture.myfirstapp.ui.view.favourites.FavCatActivity
import com.apa.accenture.myfirstapp.ui.view.search.SearchCatActivity

class MenuActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMenuBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Boton para navegar a la vista de favoritos
        binding.btnFav.setOnClickListener { navigateToFavCatActivity() }
        //Boton para navegar a la vista del buscador
        binding.btnSearch.setOnClickListener { navigateToSearchCatActivity() }
    }

    private fun navigateToFavCatActivity() {
        val intent = Intent(this, FavCatActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSearchCatActivity() {
        val intent = Intent(this, SearchCatActivity::class.java)
        startActivity(intent)
    }

}