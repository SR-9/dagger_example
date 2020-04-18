package com.example.myapplication.feature.authentication

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.data.AppData
import com.example.myapplication.di.module.network.ApiService
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    val api: ApiService,
    val data: AppData
) : BaseViewModel () {

}