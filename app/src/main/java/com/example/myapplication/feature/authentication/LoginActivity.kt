package com.example.myapplication.feature.authentication

import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.base.extension.launchActivity
import com.example.myapplication.base.view.BaseActivity
import dagger.android.AndroidInjection
import io.reactivex.Scheduler
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.login_activity.*
import javax.inject.Inject
import kotlin.random.Random
import kotlin.random.nextUInt

class LoginActivity : BaseActivity() {

    @Inject
    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)


        println("ádfasdfasdfasdfad")

//        appComponent.authComponent().create().inject(this)

        tv123.text = viewModel.data.add.toString()
        with(viewModel.api.getEmployees()) {
            subscribeOn(Schedulers.computation())
                .subscribeBy(
                    onSuccess = { println(it) },
                    onError = { it.printStackTrace() }
                )
        }
        btnNext.setOnClickListener {
            viewModel.data.add = Random.nextInt()
            tv123.text = viewModel.data.add.toString()
        }
        btnStartActivity.setOnClickListener {
            launchActivity<RegisterActivity> { }
        }
    }


}