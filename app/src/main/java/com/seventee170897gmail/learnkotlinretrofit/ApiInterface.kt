package com.seventee170897gmail.learnkotlinretrofit

import com.seventee170897gmail.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("users")
    fun getUsers(): Call<List<DataModel>>
}