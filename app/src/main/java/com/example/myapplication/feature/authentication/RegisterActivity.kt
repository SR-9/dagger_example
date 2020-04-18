package com.example.myapplication.feature.authentication

import android.os.Bundle
import com.example.myapplication.MyApplication
import com.example.myapplication.R
import com.example.myapplication.base.view.BaseActivity
import com.example.myapplication.di.data.AppData
import kotlinx.android.synthetic.main.register_activity.*
import javax.inject.Inject

class RegisterActivity : BaseActivity() {

    @Inject lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        tvInfo.text = viewModel.data.a.toString()
    }
}