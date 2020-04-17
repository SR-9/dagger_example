package com.example.myapplication.base.extension

/*

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.google.firebase.firestore.*

fun Query.addSnapshotObserver(lifecycleOwner: LifecycleOwner, listener: (QuerySnapshot?, FirebaseFirestoreException?) -> Unit) {
    val registration = addSnapshotListener(listener)
    lifecycleOwner.lifecycle.addObserver(object : LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onPause() {
            registration.remove()
            lifecycleOwner.lifecycle.removeObserver(this)
        }
    })
}

fun DocumentReference.addSnapshotObserver(
    lifecycleOwner: LifecycleOwner,
    onEvent: Lifecycle.Event = Lifecycle.Event.ON_PAUSE,
    listener: (DocumentSnapshot?, FirebaseFirestoreException?) -> Unit
): ListenerRegistration {
    val registration = addSnapshotListener(listener)

    lifecycleOwner.lifecycle.addObserver(object : LifecycleObserver {
        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        fun onPause() {
            if (onEvent == Lifecycle.Event.ON_PAUSE) {
                registration.remove()
                lifecycleOwner.lifecycle.removeObserver(this)
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun onDestroy() {
            if (onEvent == Lifecycle.Event.ON_DESTROY) {
                registration.remove()
                lifecycleOwner.lifecycle.removeObserver(this)
            }
        }
    })

    return registration
}

inline val firebaseFirestore get() = FirebaseFirestore.getInstance()

*/
