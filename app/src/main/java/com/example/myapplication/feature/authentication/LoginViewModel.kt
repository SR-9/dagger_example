package com.example.myapplication.feature.authentication

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.data.TestData
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    val pdata: TestData
) : BaseViewModel () {

}