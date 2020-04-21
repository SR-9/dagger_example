package com.example.myapplication.feature.authentication

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.data.TestData
import com.example.myapplication.di.module.storage.Storage
import javax.inject.Inject
import javax.inject.Named

class LoginViewModel @Inject constructor(
    @Named("n1") val testData: TestData,
    @Named("n2") val testDataSub: TestData,
    val storage: Storage
) : BaseViewModel () {

}