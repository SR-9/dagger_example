package com.example.myapplication.feature.authentication

import android.os.Bundle
import com.example.myapplication.ExamplePreferences
import com.example.myapplication.R
import com.example.myapplication.base.extension.launchActivity
import com.example.myapplication.base.view.BaseActivity
import kotlinx.android.synthetic.main.login_activity.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel


class LoginActivity : BaseActivity() {

    private val preferences: ExamplePreferences by inject()
    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        preferences.greeting()
        loginViewModel.data.greeting()
        println("ádfasdfasdfasdfad")

//        appComponent.authComponent().create().inject(this)

        btnNext.setOnClickListener {
        }
        btnStartActivity.setOnClickListener {
            launchActivity<RegisterActivity> { }
        }
    }

    override fun onBackPressed() {
        finishAndRemoveTask()
    }

}