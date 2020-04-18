package com.example.myapplication.di.module.storage


import android.content.Context
import com.example.myapplication.di.data.AppData
import com.example.myapplication.di.scope.ActivityScope
import com.example.myapplication.di.scope.FragmentScope
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton


// @Inject tells Dagger how to provide instances of this type
@Module class SharedPreferencesStorage @Inject constructor() {

@Inject lateinit var data: AppData

    @Provides
    @FragmentScope // or @Named
    fun greeting () : String {
        println("SharedPreferencesStorage ${hashCode()}")

        return "FragmentScope"
    }

    @Provides
    @ActivityScope // or @Named
    fun greeting1 () : String {
        println("SharedPreferencesStorage ${hashCode()}")

        return "Activity"
    }


}