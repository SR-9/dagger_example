package com.example.myapplication.di.module.network

import android.content.Context
import javax.inject.Inject

class RestfulApi @Inject constructor(context: Context) {
    fun greeting () {
        println("RestfulApi")
    }
}