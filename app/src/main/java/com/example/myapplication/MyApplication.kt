package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.data.TestData

class MyApplication : Application() {
   val appComponent: AppComponent by lazy {
       DaggerAppComponent.builder()
           .application(this)
           .appData(TestData(name = "Hieu"))
           .build()

   }

}