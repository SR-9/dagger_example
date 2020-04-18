package com.example.myapplication.feature.authentication

import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.di.data.AppData
import com.example.myapplication.di.module.storage.SharedPreferencesStorage
import javax.inject.Inject

class RegisterViewModel @Inject constructor(
    val data : AppData
)  : BaseViewModel() {

}