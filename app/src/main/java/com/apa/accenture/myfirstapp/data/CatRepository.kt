package com.apa.accenture.myfirstapp.data

import android.util.Log
import com.apa.accenture.myfirstapp.data.network.CatApi
import com.apa.accenture.myfirstapp.data.network.model.CatDetailResponse
import com.apa.accenture.myfirstapp.data.network.model.CatResponse
import com.apa.accenture.myfirstapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import javax.inject.Inject
import kotlin.math.log

class CatRepository @Inject constructor(private val api:CatApi) {

//    suspend fun getCatByBreedFromApi(): List<CatResponse>? {
//        val response: Response<List<CatResponse>> = api.getCatByBreed()
//        return if (response.isSuccessful && response.body()!=null) {
//            response.body()
//
//        } else {
//            emptyList()
//        }
//    }

//    suspend fun getCat(catName: String): List<CatResponse> {
//        val response = catApi.getCat(catName)
//        return if (response.isSuccessful) {
//            response.body()?.cats ?: emptyList()
//        } else {
//            emptyList()
//        }
//    }



}