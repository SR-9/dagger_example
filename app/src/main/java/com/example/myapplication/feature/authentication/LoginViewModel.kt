package com.example.myapplication.feature.authentication

import com.example.myapplication.ExamplePreferences
import com.example.myapplication.base.view.BaseViewModel
import com.example.myapplication.network.IApiService
import org.koin.dsl.module

val loginViewModelModule = module {
    factory { LoginViewModel(get(), get()) }
}

class LoginViewModel  constructor(
    val data: ExamplePreferences,
    val api: IApiService
) : BaseViewModel () {

}