package com.example.myapplication.di

import com.example.myapplication.di.network.RestfulApi
import com.example.myapplication.di.storage.SharedPreferencesStorage
import dagger.Module

@Module  interface RestfulModule {
    fun provideStorage(): RestfulApi
}