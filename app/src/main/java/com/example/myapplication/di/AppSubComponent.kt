package com.example.myapplication.di

import com.example.myapplication.di.submodule.AuthComponent
import com.example.myapplication.di.submodule.MainComponent
import dagger.Module


@Module(subcomponents = [
    MainComponent::class,
    AuthComponent::class
])
class AppSubComponent