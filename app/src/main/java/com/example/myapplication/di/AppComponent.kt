package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.base.view.BaseActivity
import com.example.myapplication.feature.MainActivity
import com.example.myapplication.feature.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppSubComponent::class
])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : AppComponent
    }

    fun inject(activity: MainActivity)
    fun mainComponent() : MainComponent.Factory
}