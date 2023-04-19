package com.apa.accenture.myfirstapp.ui.view.search

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.apa.accenture.myfirstapp.data.network.CatApi
import com.apa.accenture.myfirstapp.data.network.model.CatResponse
import com.apa.accenture.myfirstapp.databinding.ActivitySearchCatBinding
import com.apa.accenture.myfirstapp.ui.view.details.CatDetailsActivity
import com.apa.accenture.myfirstapp.ui.view.details.CatDetailsActivity.Companion.EXTRA_ID
import com.apa.accenture.myfirstapp.ui.view.search.adapter.CatAdapter
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class SearchCatActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySearchCatBinding;

    private  val catList = emptyList<CatResponse>()
    private  val adapter = CatAdapter(catList)

    private val searchCatViewModel: SearchCatViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchCatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCats.setHasFixedSize(true)
        binding.rvCats.layoutManager = LinearLayoutManager(this)
        binding.searchView
        binding.rvCats.adapter = adapter

        initUI()
    }
    private fun initUI() {
    }

    private fun initComponents(){

    }


    private fun navegateToDetail(id: String) {
        val intent = Intent(this,CatDetailsActivity::class.java)
        intent.putExtra(EXTRA_ID,id)
        startActivity(intent)
    }


}