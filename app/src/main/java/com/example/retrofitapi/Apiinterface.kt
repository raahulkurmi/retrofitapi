package com.example.retrofitapi

import retrofit2.Call
import retrofit2.http.GET

interface Apiinterface {
    @GET("gimme")
    fun getdata(): Call<jsonkotlinclass>

}