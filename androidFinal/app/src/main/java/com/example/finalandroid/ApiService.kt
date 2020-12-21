package com.example.finalandroid

import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("category/{category}/{country}.json")
    fun getInfos(@Path("category") category: String): Call<List<Info>>
    @GET("category/{category}/{country}.json")
    fun getCounty(@Path("country") category: String): Call<List<Info>>
}