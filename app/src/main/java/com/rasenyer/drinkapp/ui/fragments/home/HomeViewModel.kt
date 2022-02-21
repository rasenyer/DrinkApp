package com.rasenyer.drinkapp.ui.fragments.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rasenyer.drinkapp.data.remote.models.Drink
import com.rasenyer.drinkapp.data.remote.models.Drinks
import com.rasenyer.drinkapp.data.remote.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel: ViewModel() {

    private var drinks = MutableLiveData<List<Drink>>()

    fun getDrinksByName(name: String?) {

        RetrofitInstance.drinkApi.getDrinksByName(name).enqueue(object : Callback<Drinks> {

            override fun onResponse(call: Call<Drinks>, response: Response<Drinks>) {

                if (response.body() != null) {
                    drinks.value = response.body()!!.drinks
                }

            }

            override fun onFailure(call: Call<Drinks>, t: Throwable) {
                Log.d("Error", t.message.toString())
            }

        })

    }

    fun observeDrinks(): LiveData<List<Drink>> {
        return drinks
    }

}