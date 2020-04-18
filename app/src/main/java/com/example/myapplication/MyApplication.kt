package com.example.myapplication

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.DaggerAppComponent
import com.example.myapplication.di.data.AppData
import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication : Application(),
    Application.ActivityLifecycleCallbacks,
    HasAndroidInjector
{
//   val appComponent: AppComponent by lazy {
//       DaggerAppComponent.builder()
//           .application(this)
//           .data(TestData("hello"))
//           .appData(AppData())
//           .build()
//   }

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
//        DaggerAppComponent.builder()
//            .build()
//            .inject(this)
    }


    override fun androidInjector(): AndroidInjector<Any> {
        return activityInjector as  AndroidInjector<Any>
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityStarted(activity: Activity) {
    }

    override fun onActivityDestroyed(activity: Activity) {
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
    }

    override fun onActivityStopped(activity: Activity) {
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        AndroidInjection.inject(activity)
    }

    override fun onActivityResumed(activity: Activity) {
    }
}