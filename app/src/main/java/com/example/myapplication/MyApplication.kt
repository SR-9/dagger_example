package com.example.myapplication

import android.app.Application
import android.content.Context
import com.example.myapplication.feature.authentication.loginViewModelModule
import com.example.myapplication.network.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.Koin
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.logger.Level
import org.koin.dsl.module
import java.util.*

class MyApplication : Application(){


    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            androidLogger(level = Level.INFO)
            androidFileProperties(koinPropertyFile = "koin.properties")
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
    single { ExamplePreferences(androidContext(), getProperty("name")) }
}

val prefModule2 = module {
    single { ExamplePreferences2(get()) }
}

class ExamplePreferences(context: Context, val name: String) {

    var a = 0
    fun greeting() {
        a += 1
        println(name)
        println("1ExamplePreferences $a")
    }
}

class ExamplePreferences2(val pre1 : ExamplePreferences) {

    fun greeting() {
        pre1.greeting()
    }
}
