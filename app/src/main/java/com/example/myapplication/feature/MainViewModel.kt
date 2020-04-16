package com.example.myapplication.feature

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.network.RestfulApi
import com.example.myapplication.di.storage.SharedPreferencesStorage
import com.example.myapplication.di.storage.SubSharedPreferencesStorage
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val storage: SharedPreferencesStorage,
    private val api: RestfulApi
) : BaseViewModel() {

    fun getting() {
        storage.greeting()
        api.greeting()
        println("hello ")
    }

}