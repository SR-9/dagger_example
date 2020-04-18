package com.example.myapplication.feature.authentication

import android.os.Bundle
import com.example.myapplication.ExamplePreferences
import com.example.myapplication.ExamplePreferences2
import com.example.myapplication.MyApplication
import com.example.myapplication.R
import com.example.myapplication.base.view.BaseActivity
import kotlinx.android.synthetic.main.register_activity.*
import org.koin.android.ext.android.inject

class RegisterActivity : BaseActivity() {

    private val preferences: ExamplePreferences2 by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)

        preferences.greeting()
    }
}