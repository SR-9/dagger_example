package com.example.myapplication.feature

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.module.network.RestfulApi
import com.example.myapplication.di.module.storage.SubSharedPreferencesStorage
import com.example.myapplication.di.storage.SharedPreferencesStorage
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val storage: SharedPreferencesStorage,
    private val api: RestfulApi,
    private val subModule: SubSharedPreferencesStorage
) : BaseViewModel() {

    fun getting() {
        subModule.greeting()
        storage.greeting()
        api.greeting()
        println("hello ")
    }

}