package com.example.myapplication.feature

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.module.network.ApiService
import com.example.myapplication.di.module.storage.SubSharedPreferencesStorage
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val storage: SharedPreferencesStorage,
    private val api: ApiService,
    private val subModule: SubSharedPreferencesStorage
) : BaseViewModel() {

    fun getting() {
        subModule.greeting()
        storage.greeting()
        with(api.searchGoogle("go")) {
            subscribeOn(Schedulers.computation())
                .subscribeBy {  }
        }

        println("hello ")
    }

}