package com.apa.accenture.myfirstapp.data.network

import com.apa.accenture.myfirstapp.data.network.model.CatResponse
import com.apa.accenture.myfirstapp.utils.Constants.Companion.API_KEY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class CatApiService @Inject constructor( val api: CatApi) {

//    suspend fun getCatBreedByName(name: String): CatResponse? {
//        val apiKey = "live_nSdNn2oQfz6dIl09fEW3EarL82Q4BRf16BuQsNghEW0l31j5EqONY6mKFqAQRPzQ"
//        val breeds = api.getBreedByName(name, apiKey)
//        if (breeds.isNotEmpty()) {
//            val breed = breeds[0]
//            return CatResponse(
//                id = breed.id,
//                name = breed.name,
//                image = breed.image.url
//            )
//        }
//        return null
//    }

//    suspend fun getBreedByName(name: String): List<CatResponse> {
//        return withContext(Dispatchers.IO) {
//            val response = api.getBreedByName(name, API_KEY)
//            if (response.isSuccessful) {
//                response.body() ?: emptyList()
//            } else {
//                emptyList()
//            }
//        }
//    }
}