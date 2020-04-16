package com.example.myapplication.di

import com.example.myapplication.di.storage.SharedPreferencesStorage
import com.example.myapplication.di.storage.SubSharedPreferencesStorage
import com.example.myapplication.feature.MainComponent
import dagger.Module


@Module(subcomponents = [
    MainComponent::class
])
class AppSubComponent