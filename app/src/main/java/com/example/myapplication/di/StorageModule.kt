package com.example.myapplication.di

import com.example.myapplication.di.storage.SharedPreferencesStorage
import dagger.Module

@Module  interface StorageModule {
    fun provideStorage(): SharedPreferencesStorage
}