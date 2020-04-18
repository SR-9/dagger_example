package com.example.myapplication.feature.authentication

import com.example.myapplication.ExamplePreferences
import com.example.myapplication.base.view.BaseViewModel
import org.koin.dsl.module

val loginViewModelModule = module {
    factory { LoginViewModel(get()) }
}

class LoginViewModel  constructor(
    val data: ExamplePreferences
) : BaseViewModel () {

}