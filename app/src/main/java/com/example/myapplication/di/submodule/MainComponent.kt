package com.example.myapplication.di.submodule

import com.example.myapplication.di.module.storage.SubSharedPreferencesStorage
import com.example.myapplication.feature.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [SubSharedPreferencesStorage::class])
interface  MainComponent {
    // Factory to create instances of LoginComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
}