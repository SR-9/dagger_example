package com.example.myapplication.feature.authentication

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.example.myapplication.ExamplePreferences
import com.example.myapplication.R
import com.example.myapplication.base.extension.launchActivity
import com.example.myapplication.base.view.BaseActivity
import com.trello.rxlifecycle3.android.lifecycle.kotlin.bindToLifecycle
import io.reactivex.Observable
import io.reactivex.rxkotlin.Observables
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.login_activity.*
import kotlinx.coroutines.*
import okhttp3.ResponseBody
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.coroutines.suspendCoroutine


class LoginActivity : BaseActivity() {

    private val preferences: ExamplePreferences by inject()
    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        preferences.greeting()
        loginViewModel.data.greeting()

        liveData {
            try {
                val data = loginViewModel.api.testApi()
                emit(data)
            } catch (e: Exception) {
                emit("error")
            }
        }.observe(this, Observer {
            println("reaasdfadf")
            println(it)
        })

        println("ádfasdfasdfasdfad")

//        appComponent.authComponent().create().inject(this)

        btnNext.setOnClickListener {
        }
        btnStartActivity.setOnClickListener {
            launchActivity<RegisterActivity> { }
        }

        with(Observable.just(1)) {
            bindToLifecycle(this@LoginActivity)
                .subscribeBy { }
        }

        GlobalScope.launch {
            println(hello1())
            println(Thread.currentThread().name)
        }



//        loginViewModel.api.testApi().subscribeOn(Schedulers.io()).subscribeBy {
//            println(it)
//        }

        println("done")
    }

    override fun onBackPressed() {
        finishAndRemoveTask()

    }

    suspend fun hello1() = withContext(Dispatchers.IO) {
        Thread.sleep(2000)
         "text1"
    }
}