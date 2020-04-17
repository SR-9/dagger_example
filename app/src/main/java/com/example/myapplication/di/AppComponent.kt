package com.example.myapplication.di

import android.app.Application
import com.example.myapplication.MyApplication
import com.example.myapplication.di.data.AppData
import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.module.network.RestfulApi
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import com.example.myapplication.di.submodule.AuthComponent
import com.example.myapplication.di.submodule.MainComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    RestfulApi::class,
    SharedPreferencesStorage::class,
    AppSubComponent::class,
    AppData::class
])
interface AppComponent {
//
//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(application: MyApplication): Builder
//        fun data(data : TestData) : Builder
//        fun build(): AppComponent
//    }

//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance context: Context) : AppComponent
//    }

    //fun inject(activity: MainActivity)
    fun mainComponent() : MainComponent.Factory
    fun authComponent() : AuthComponent.Factory


    fun data() : TestData
}