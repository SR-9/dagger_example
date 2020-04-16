package com.example.myapplication.di

import com.example.myapplication.di.module.network.RestfulApi
import dagger.Module

@Module  interface RestfulModule {
    fun provideStorage(): RestfulApi
}