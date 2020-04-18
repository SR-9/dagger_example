package com.example.myapplication.di

import com.example.myapplication.feature.authentication.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule  {
    @ContributesAndroidInjector
    abstract fun contributeLoginActivity(): LoginActivity
}