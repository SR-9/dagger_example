package com.example.myapplication.feature.authentication

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.module.network.ApiService
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    val data: SharedPreferencesStorage,
    val api: ApiService
) : BaseViewModel () {

}