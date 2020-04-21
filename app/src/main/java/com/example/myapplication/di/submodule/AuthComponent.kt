package com.example.myapplication.di.submodule

import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.module.storage.SubStorage
import com.example.myapplication.feature.authentication.LoginActivity
import com.example.myapplication.feature.authentication.RegisterActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(modules = [SubStorage::class])
interface  AuthComponent {
    @Subcomponent.Builder
    interface Builder {
        fun data(@BindsInstance @Named("n2") value: TestData) : Builder
        fun build(): AuthComponent
    }

    fun inject(activity: LoginActivity)
    fun inject(activity: RegisterActivity)
}