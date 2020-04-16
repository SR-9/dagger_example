package com.example.myapplication.di.storage


import android.content.Context
import dagger.Subcomponent
import javax.inject.Inject

// @Inject tells Dagger how to provide instances of this type
class SubSharedPreferencesStorage constructor(context: Context)  {
    fun greeting () {
        println("SubSharedPreferencesStorage ${hashCode()}")
    }
}