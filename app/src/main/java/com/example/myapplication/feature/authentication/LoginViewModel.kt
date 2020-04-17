package com.example.myapplication.feature.authentication

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import com.example.myapplication.di.module.storage.SubSharedPreferencesStorage
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    val pdata: TestData
) : BaseViewModel () {

}