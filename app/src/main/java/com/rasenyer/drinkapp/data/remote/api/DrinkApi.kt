package com.rasenyer.drinkapp.data.remote.api

import com.rasenyer.drinkapp.data.remote.models.Drinks
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DrinkApi {

    @GET("search.php?")
    fun getDrinksByName(@Query("s") name: String?): Call<Drinks>

}