package com.example.myapplication

import android.app.Application
import android.content.Context
import com.example.myapplication.feature.authentication.loginViewModelModule
import com.example.myapplication.network.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application(){


    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(listOf(
                prefModule,
                prefModule2,
                networkModule,
                loginViewModelModule
            ))
        }
    }

}

val prefModule = module {
    single { ExamplePreferences(androidContext()) }
}

val prefModule2 = module {
    single { ExamplePreferences2(get()) }
}

class ExamplePreferences(context: Context) {

    var a = 0
    fun greeting() {
        a += 1
        println("ExamplePreferences $a")
    }
}

class ExamplePreferences2(val pre1 : ExamplePreferences) {

    fun greeting() {
        pre1.greeting()
    }
}
