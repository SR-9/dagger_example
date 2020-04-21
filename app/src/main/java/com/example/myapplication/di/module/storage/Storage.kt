package com.example.myapplication.di.module.storage


import android.content.Context
import com.example.myapplication.di.data.TestData
import dagger.Module
import javax.inject.Inject
import javax.inject.Named

// @Inject tells Dagger how to provide instances of this type
@Module class Storage @Inject constructor() {

    @Inject @Named("n1") lateinit var data: TestData

    fun greeting () {
        println("SharedPreferencesStorage ${data.name}")
    }
}