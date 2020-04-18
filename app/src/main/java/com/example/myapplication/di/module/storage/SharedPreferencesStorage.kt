package com.example.myapplication.di.module.storage


import android.content.Context
import com.example.myapplication.di.data.AppData
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

// @Inject tells Dagger how to provide instances of this type
@Module class SharedPreferencesStorage @Inject constructor() {

 var data = AppData()

    @Singleton
    @Provides
    fun appData() : AppData {
        data.a += 1
        return data
    }

    fun greeting () : String {
        println("SharedPreferencesStorage ${hashCode()}")

        return "sadfasdfasfsadfsadfdsfdsfdsafdsafads"
    }

}