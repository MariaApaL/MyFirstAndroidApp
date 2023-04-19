package com.apa.accenture.myfirstapp.data.network


//import com.apa.accenture.myfirstapp.data.network.model.CatDetailResponse
import com.apa.accenture.myfirstapp.data.network.model.CatResponse
import com.apa.accenture.myfirstapp.domain.model.CatBreed
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface CatApi {

    @GET("cat_breeds/breed/{breed}")
    suspend fun getCatByBreed(
        @Path("breed") breed: String,
        @Header("X-RapidAPI-Key") apiKey: String
    ): List<CatResponse>
//
//    @GET("/v1/breeds/search")
//    suspend fun getCat(@Query("name") catBreed:String, @Header("api_key") apiKey:String ): Response <List<CatResponse>>
//
//    @GET("/v1/breeds?limit=10&page=0")
//    suspend fun getAllCats():Response<List<CatResponse>>


//    @GET("/v1/breeds/{id}")
//    suspend fun getCatDetails(@Path("id") catId:String):Response<CatDetailResponse>
}