package com.example.myapplication.feature.authentication

import android.annotation.SuppressLint
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.authComponent
import com.example.myapplication.base.extension.launchActivity
import com.example.myapplication.base.view.BaseActivity
import kotlinx.android.synthetic.main.login_activity.*
import javax.inject.Inject
import kotlin.random.Random

class LoginActivity : BaseActivity() {

    @Inject lateinit var viewModel: LoginViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        authComponent.inject(this)

        tvAppComponent.text = "app " +viewModel.testData.name
        tvSubComponent.text = "sub " + viewModel.testDataSub.name
        btnNext.setOnClickListener {
            viewModel.testData.name = Random.nextInt(100).toString()
            viewModel.testDataSub.name = Random.nextInt(100).toString()
            tvAppComponent.text = "app " +viewModel.testData.name
            tvSubComponent.text = "sub " + viewModel.testDataSub.name
        }
        btnStartActivity.setOnClickListener {
            launchActivity<RegisterActivity> {  }
        }
    }
}