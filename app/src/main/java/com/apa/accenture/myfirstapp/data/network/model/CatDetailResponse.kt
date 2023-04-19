package com.apa.accenture.myfirstapp.data.network.model

import com.google.gson.annotations.SerializedName

data class CatDetailResponse(
    @SerializedName("id") val id:String,
    @SerializedName("breed") val breed:String,
    @SerializedName("img") val img: String,
    @SerializedName("origin") val description:String,
)

