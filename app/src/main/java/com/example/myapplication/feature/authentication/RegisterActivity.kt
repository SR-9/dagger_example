package com.example.myapplication.feature.authentication

import android.annotation.SuppressLint
import android.os.Bundle
import com.example.myapplication.MyApplication
import com.example.myapplication.R
import com.example.myapplication.base.view.BaseActivity
import kotlinx.android.synthetic.main.register_activity.*
import javax.inject.Inject

class RegisterActivity : BaseActivity() {

    @Inject
    lateinit var viewModel: RegisterViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
        (application as MyApplication).authComponent.inject(this)
        tvSubComponent.text = "sub " +  viewModel.value.name
        tvAppComponent.text = "app " + viewModel.pdata.name
    }
}