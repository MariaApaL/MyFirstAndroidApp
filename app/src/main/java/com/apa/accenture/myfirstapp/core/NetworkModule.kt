package com.apa.accenture.myfirstapp.core

import android.content.Context
import com.apa.accenture.myfirstapp.data.network.CatApi
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//Para injectar librerias ( ejemplo retrofit), ya que no podemos acceder a ella por dagger
@Module
//Para que cualquier clase pueda acceder a el
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
            Retrofit
            .Builder()
            .baseUrl("https://cat-breeds.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    @Provides
    @Singleton
    fun provideCatApi(retrofit:Retrofit):CatApi {
        return retrofit.create(CatApi::class.java)

    }


}