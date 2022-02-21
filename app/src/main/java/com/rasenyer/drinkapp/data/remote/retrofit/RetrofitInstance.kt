package com.rasenyer.drinkapp.data.remote.retrofit

import com.rasenyer.drinkapp.data.remote.api.DrinkApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val drinkApi: DrinkApi by lazy {

        Retrofit.Builder()
            .baseUrl("https://www.thecocktaildb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DrinkApi::class.java)

    }

}