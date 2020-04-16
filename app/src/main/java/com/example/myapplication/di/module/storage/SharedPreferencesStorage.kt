package com.example.myapplication.di.storage


import android.content.Context
import javax.inject.Inject

// @Inject tells Dagger how to provide instances of this type
class SharedPreferencesStorage @Inject constructor(context: Context)  {
    fun greeting () {
        println("SharedPreferencesStorage ${hashCode()}")
    }
}