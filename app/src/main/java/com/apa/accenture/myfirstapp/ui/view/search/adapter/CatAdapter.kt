package com.apa.accenture.myfirstapp.ui.view.search.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apa.accenture.myfirstapp.R
import com.apa.accenture.myfirstapp.data.network.model.CatResponse
import com.apa.accenture.myfirstapp.databinding.CatLayoutBinding
import com.apa.accenture.myfirstapp.ui.view.details.CatDetailsActivity
import com.apa.accenture.myfirstapp.ui.view.search.SearchCatActivity
import com.squareup.picasso.Picasso
import javax.inject.Inject

class CatAdapter ( var catList: List<CatResponse> = emptyList()) : RecyclerView.Adapter<CatAdapter.CatViewHolder>() {


    fun updateList(catList: List<CatResponse>) {
        this.catList = catList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val binding = CatLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(viewholder: CatViewHolder, position: Int) {

        viewholder.bind(catList[position])
    }

    override fun getItemCount(): Int {
        return catList.size
    }



    class CatViewHolder(private val binding: CatLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(catResponse: CatResponse) {
            binding.tvCatName.text = catResponse.name

            // Carga la imagen usando Picasso
            Picasso.get().load(catResponse.catImage.url).into(binding.ivCat)
//            binding.root.setOnClickListener { onItemSelected(catResponse.id) }
        }
    }

}