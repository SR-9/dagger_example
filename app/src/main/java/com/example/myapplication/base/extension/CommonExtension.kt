package com.example.myapplication.base.extension

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.view.View
import android.view.ViewTreeObserver
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.BuildConfig


private val displayMetrics by lazy { Resources.getSystem().displayMetrics }
val screenWidth = displayMetrics.widthPixels
val screenHeight = displayMetrics.heightPixels


val Int.dp: Int get() = (this * displayMetrics.density).toInt()
val Int.sp: Float get() = this * displayMetrics.scaledDensity

inline fun <reified T : Any> Context.newIntent(): Intent = Intent(this, T::class.java)

inline fun <reified T : Any> Context.launchActivity(noinline init: Intent.() -> Unit = {}) {
    val intent = newIntent<T>()
    intent.init()
    startActivity(intent)
}


inline fun <reified T : Any> Activity.launchActivity(
    requestCode: Int = -1,
    noinline init: Intent.() -> Unit = {}
) {
    val intent = newIntent<T>()
    intent.init()
    startActivityForResult(intent, requestCode, null)
}

inline fun <reified T : Any> Fragment.launchActivity(
    requestCode: Int = -1,
    noinline init: Intent.() -> Unit = {}
) {
    context?.let {
        val intent = it.newIntent<T>()
        intent.init()
        startActivityForResult(intent, requestCode, null)
    }
}

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
    beginTransaction().apply(func)
        .commitNowAllowingStateLoss()
}



inline fun View.doOnPreDraw(crossinline action: View.() -> Unit) {
    viewTreeObserver.addOnPreDrawListener(object : ViewTreeObserver.OnPreDrawListener {
        override fun onPreDraw(): Boolean {
            action()
            when {
                viewTreeObserver.isAlive -> viewTreeObserver.removeOnPreDrawListener(this)
                else -> viewTreeObserver.removeOnPreDrawListener(this)
            }
            return true
        }
    })
}

inline fun <reified T> Context.systemService() = ContextCompat.getSystemService(this, T::class.java)!!

fun Activity.hideKeyboard() {
    val view = currentFocus ?: View(this)
    systemService<InputMethodManager>().hideSoftInputFromWindow(view.windowToken, 0)
}

fun Activity.showKeyboard() {
    val view = currentFocus ?: View(this)
    systemService<InputMethodManager>().showSoftInput(view, 0)
}

fun View.hideKeyboard() {
    context.systemService<InputMethodManager>().hideSoftInputFromWindow(windowToken, 0)
}

fun View.showKeyboard() {
    context.systemService<InputMethodManager>().showSoftInput(this, 0)
}


inline val Context.sharedPreferences get() = getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)!!


