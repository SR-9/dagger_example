package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent

class MyApplication : Application() {
//   val appComponent: AppComponent by lazy {
//       DaggerAppComponent.builder()
//           .application(this)
//           .build()
//   }

    override fun onCreate() {
        super.onCreate()
        daggerInjectApplication()
    }

    private fun daggerInjectApplication() {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}