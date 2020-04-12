package com.example.myapplication

import com.example.myapplication.di.network.RestfulApi
import com.example.myapplication.di.storage.SharedPreferencesStorage
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val  storage : SharedPreferencesStorage,
    private val  api : RestfulApi
) {

    fun getting() {
        storage.greeting()
        api.greeting()
        println("hello ")
    }

}