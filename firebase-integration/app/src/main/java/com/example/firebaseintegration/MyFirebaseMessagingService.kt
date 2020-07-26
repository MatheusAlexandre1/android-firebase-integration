package com.example.firebaseintegration

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage


class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(s: String?) {
        Log.d("New firebase Token", s ?: "")
        super.onNewToken(s)
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        Log.d("On message Received", remoteMessage.toString())
        super.onMessageReceived(remoteMessage)
    }
}


