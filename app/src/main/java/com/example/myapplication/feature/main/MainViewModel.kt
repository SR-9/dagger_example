package com.example.myapplication.feature.main

import com.example.myapplication.base.view.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(

) : BaseViewModel() {

    fun getting() {
//        subModule.greeting()
//        storage.greeting()
//        with(api.getEmployees()) {
//            subscribeOn(Schedulers.computation())
//                .subscribeBy(
//                    onSuccess = { println(it) },
//                    onError = { it.printStackTrace() }
//                )
//        }
//
        println("hello ")
    }

}