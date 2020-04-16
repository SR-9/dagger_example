package com.example.myapplication.feature

import com.example.myapplication.base.view.BaseActivity
import com.example.myapplication.di.storage.SubSharedPreferencesStorage
import dagger.Subcomponent

@Subcomponent
interface  MainComponent {
    // Factory to create instances of LoginComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
}