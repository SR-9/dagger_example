package com.example.myapplication.feature.authentication

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.data.TestData
import javax.inject.Inject
import javax.inject.Named

class LoginViewModel @Inject constructor(
    @Named("n1") val pdata: TestData,
    @Named("n2") val value: TestData
) : BaseViewModel () {

}