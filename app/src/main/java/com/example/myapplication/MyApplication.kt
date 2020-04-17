package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.data.AppData
import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.module.storage.SharedPreferencesStorage

class MyApplication : Application() {
   val appComponent: AppComponent by lazy {
       DaggerAppComponent.builder()
//           .application(this)
//           .data(TestData("hello"))
//           .appData(AppData())
           .build()

   }

}