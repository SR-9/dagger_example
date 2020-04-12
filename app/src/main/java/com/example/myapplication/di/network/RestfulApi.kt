package com.example.myapplication.di.network

import android.content.Context
import javax.inject.Inject

class RestfulApi @Inject constructor(context: Context) {
    fun greeting () {
        println("RestfulApi")
    }
}