package com.apa.accenture.myfirstapp.domain

import com.apa.accenture.myfirstapp.data.CatRepository
import com.apa.accenture.myfirstapp.data.network.CatApi
import com.apa.accenture.myfirstapp.data.network.model.CatResponse
import com.apa.accenture.myfirstapp.domain.model.Cat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class GetCats @Inject constructor(private val repository: CatRepository, val api: CatApi) {


//    suspend operator fun invoke(): List<Cat>?{
//        val cats = repository.getAllCatsFromApi()
//        return cats
//    }

}