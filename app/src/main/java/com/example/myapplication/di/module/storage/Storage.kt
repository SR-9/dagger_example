package com.example.myapplication.di.module.storage


import android.content.Context
import dagger.Module
import javax.inject.Inject

// @Inject tells Dagger how to provide instances of this type
@Module class Storage @Inject constructor() {
    fun greeting () {
        println("SharedPreferencesStorage ${hashCode()}")
    }
}