package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.submodule.AuthComponent

class MyApplication : Application() {
   val appComponent: AppComponent by lazy {
       DaggerAppComponent.builder()
           .application(this)
           .appData(TestData(name = "app Component"))
           .build()

   }

    val authComponent: AuthComponent by  lazy {
        appComponent.authComponent()
            .data(TestData("sub component"))
            .build()
    }

}