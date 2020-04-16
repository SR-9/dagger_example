@file:JvmName("ThreadUtil")
@file:JvmMultifileClass

package com.example.myapplication.base.extension

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors


private val IO_EXECUTOR = Executors.newSingleThreadExecutor()
private val POOL_EXECUTOR = Executors.newCachedThreadPool()
private val handler = Handler(Looper.getMainLooper())
private val mainThread: Thread = Looper.getMainLooper().thread


fun ioThread(function: () -> Unit) {
    IO_EXECUTOR.execute(function)
}

fun poolThread(function: () -> Unit) {
    POOL_EXECUTOR.execute(function)
}

fun uiThread(f: () -> Unit): Boolean {
    if (mainThread == Thread.currentThread()) {
        f()
    } else {
        handler.post { f() }
    }
    return true
}
