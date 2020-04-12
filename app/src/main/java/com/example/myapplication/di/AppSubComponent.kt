package com.example.myapplication.di

import com.example.myapplication.MainComponent
import com.example.myapplication.MainViewModel
import dagger.Module


@Module(subcomponents = [
    MainComponent::class
])
class AppSubComponent