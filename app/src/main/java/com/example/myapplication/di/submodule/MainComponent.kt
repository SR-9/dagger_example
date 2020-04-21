package com.example.myapplication.di.submodule

import com.example.myapplication.di.module.storage.SubStorage
import com.example.myapplication.feature.main.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [SubStorage::class])
interface  MainComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }
    fun inject(activity: MainActivity)
}