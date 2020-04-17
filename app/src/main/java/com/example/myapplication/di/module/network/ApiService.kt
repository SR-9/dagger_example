package com.example.myapplication.di.module.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("get?foo1=bar1&foo2=bar2")
    fun getEmployees(): Single<Any>
}