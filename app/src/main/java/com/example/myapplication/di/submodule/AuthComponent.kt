package com.example.myapplication.di.submodule

import com.example.myapplication.di.module.storage.SubStorage
import com.example.myapplication.feature.authentication.LoginActivity
import com.example.myapplication.feature.authentication.RegisterActivity
import dagger.Subcomponent

@Subcomponent(modules = [SubStorage::class])
interface  AuthComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): AuthComponent
    }

    fun inject(activity: LoginActivity)
    fun inject(activity: RegisterActivity)
}