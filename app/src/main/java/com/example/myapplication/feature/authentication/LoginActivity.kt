package com.example.myapplication.feature.authentication

import android.annotation.SuppressLint
import android.os.Bundle
import com.example.myapplication.MyApplication
import com.example.myapplication.R
import com.example.myapplication.base.extension.launchActivity
import com.example.myapplication.base.view.BaseActivity
import kotlinx.android.synthetic.main.login_activity.*
import javax.inject.Inject
import kotlin.random.Random
import kotlin.random.nextUInt

class LoginActivity : BaseActivity() {

    @Inject lateinit var viewModel: LoginViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        (application as MyApplication).authComponent.inject(this)

        tvAppComponent.text = "app " +viewModel.pdata.name
        tvSubComponent.text = "sub " + viewModel.value.name
        btnNext.setOnClickListener {
            viewModel.pdata.name = Random.nextInt(100).toString()
            viewModel.value.name = Random.nextInt(100).toString()
            tvAppComponent.text = "app " +viewModel.pdata.name
            tvSubComponent.text = "sub " + viewModel.value.name
        }
        btnStartActivity.setOnClickListener {
            launchActivity<RegisterActivity> {  }
        }
    }
}