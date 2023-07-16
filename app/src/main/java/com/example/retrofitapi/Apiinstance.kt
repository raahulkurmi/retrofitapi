package com.example.retrofitapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Apiinstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://meme-api.com/").
        addConverterFactory(GsonConverterFactory.create()).
        build()



    }

     val apiinter by lazy {
        retrofit.create(Apiinterface::class.java)
    }
}