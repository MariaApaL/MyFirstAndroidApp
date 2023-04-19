package com.apa.accenture.myfirstapp.data.network.model

import com.google.gson.annotations.SerializedName

data class CatResponse(
    @SerializedName("id") val id: String,
    @SerializedName("breed") val name: String,
    @SerializedName("img") val img: String
)



