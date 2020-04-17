package com.example.myapplication.di.module.storage


import android.content.Context
import dagger.Module
import javax.inject.Inject
import javax.inject.Singleton

// @Inject tells Dagger how to provide instances of this type
@Module
class SubSharedPreferencesStorage @Inject constructor()  {

    var add = 0

    fun greeting () {
        println("SubSharedPreferencesStorage ${hashCode()}")
    }
}