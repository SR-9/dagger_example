package com.example.myapplication.di.storage


import android.content.Context
import dagger.Module
import dagger.Subcomponent
import javax.inject.Inject

// @Inject tells Dagger how to provide instances of this type
@Module class SubSharedPreferencesStorage @Inject constructor(context: Context)  {
    fun greeting () {
        println("SubSharedPreferencesStorage ${hashCode()}")
    }
}