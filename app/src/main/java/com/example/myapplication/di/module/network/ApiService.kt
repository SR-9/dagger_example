package com.example.myapplication.di.module.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search")
    fun searchGoogle(@Query("q") search: String): Single<String>
}