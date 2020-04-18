package com.example.myapplication

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.data.AppData
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication : Application(),
    Application.ActivityLifecycleCallbacks,
    HasAndroidInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(this)
        DaggerAppComponent.builder()
            .application(this)
            .appData(AppData())
            .build()
            .inject(this)
    }


    @Suppress("UNCHECKED_CAST")
    override fun androidInjector(): AndroidInjector<Any> {
        return activityInjector as AndroidInjector<Any>
    }

    // Inject Activity
    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        AndroidInjection.inject(activity)
    }

    override fun onActivityPaused(activity: Activity) = Unit
    override fun onActivityStarted(activity: Activity) = Unit
    override fun onActivityDestroyed(activity: Activity) = Unit
    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) = Unit
    override fun onActivityStopped(activity: Activity) = Unit
    override fun onActivityResumed(activity: Activity) = Unit
}