package com.example.myapplication.di

import com.example.myapplication.di.submodule.MainComponent
import dagger.Module


@Module(subcomponents = [
    MainComponent::class
])
class AppSubComponent