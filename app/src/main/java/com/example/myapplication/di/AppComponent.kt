package com.example.myapplication.di

import com.example.myapplication.MyApplication
import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.module.network.RestfulApi
import com.example.myapplication.di.module.storage.Storage
import com.example.myapplication.di.submodule.AuthComponent
import com.example.myapplication.di.submodule.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [
    RestfulApi::class,
    Storage::class,
    AppSubComponent::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun application(@BindsInstance application: MyApplication): Builder
        fun appData(@BindsInstance @Named("n1") data: TestData) : Builder
        fun build(): AppComponent
    }

    fun mainComponent() : MainComponent.Builder
    fun authComponent() : AuthComponent.Builder


}