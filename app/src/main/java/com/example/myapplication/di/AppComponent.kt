package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.MyApplication
import com.example.myapplication.di.data.AppData
import com.example.myapplication.di.module.network.RestfulApi
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ActivityModule::class,
        AndroidInjectionModule::class,
        SharedPreferencesStorage::class,
        RestfulApi::class
    ]
)
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {

       // fun application(@BindsInstance context: Context): Builder
        fun appData(@BindsInstance appData: AppData): Builder

        fun build(): AppComponent
    }

//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance context: Context) : AppComponent
//    }

    //fun inject(activity: MainActivity)
//    fun mainComponent() : MainComponent.Factory
//    fun authComponent() : AuthComponent.Factory

    override fun inject(application: MyApplication)

    fun appData() : AppData
}