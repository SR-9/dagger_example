package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.MainActivity
import com.example.myapplication.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubComponent::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : AppComponent
    }

    fun inject(activity: MainActivity)
    fun mainComponent() : MainComponent.Factory
}