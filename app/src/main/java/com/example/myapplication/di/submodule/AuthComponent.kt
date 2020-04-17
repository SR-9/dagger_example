package com.example.myapplication.di.submodule

import com.example.myapplication.di.module.storage.SubSharedPreferencesStorage
import com.example.myapplication.feature.authentication.LoginActivity
import com.example.myapplication.feature.authentication.RegisterActivity
import com.example.myapplication.feature.main.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [SubSharedPreferencesStorage::class])
interface  AuthComponent {
    // Factory to create instances of LoginComponent
//    @Subcomponent.Factory
//    interface Factory {
//        fun create(): AuthComponent
//    }

    // Classes that can be injected by this Component
    fun inject(activity: LoginActivity)
    fun inject(activity: RegisterActivity)
}