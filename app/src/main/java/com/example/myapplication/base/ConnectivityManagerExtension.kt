package com.example.myapplication.base


import android.annotation.SuppressLint
import android.net.ConnectivityManager
import android.net.NetworkRequest
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

@SuppressLint("MissingPermission")
fun ConnectivityManager.registerNetworkCallbackLifeCycle(lifecycleOwner: LifecycleOwner, callback: ConnectivityManager.NetworkCallback) {
    registerNetworkCallback ( NetworkRequest.Builder().build(), callback)

    lifecycleOwner.lifecycle.addObserver(object : LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun onDestroy() {
            unregisterNetworkCallback(callback)
        }
    })
}