package com.example.myapplication.feature.authentication

import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.base.extension.launchActivity
import com.example.myapplication.base.view.BaseActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.login_activity.*
import javax.inject.Inject
import kotlin.random.Random
import kotlin.random.nextUInt

class LoginActivity : BaseActivity() {

    @Inject lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

//        appComponent.authComponent().create().inject(this)

        tv123.text = viewModel.pdata.name
        btnNext.setOnClickListener {
            viewModel.pdata.name = Random.nextInt(100).toString()
            tv123.text = viewModel.pdata.name
        }
        btnStartActivity.setOnClickListener {
            launchActivity<RegisterActivity> {  }
        }
    }
}