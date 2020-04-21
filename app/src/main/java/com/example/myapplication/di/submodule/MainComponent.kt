package com.example.myapplication.di.submodule

import com.example.myapplication.di.module.storage.SubStorage
import com.example.myapplication.feature.main.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [SubStorage::class])
interface  MainComponent {
    @Subcomponent.Builder
    interface Builder {
        fun build(): MainComponent
    }
    fun inject(activity: MainActivity)
}