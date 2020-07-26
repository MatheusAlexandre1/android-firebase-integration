package com.example.firebaseintegration

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.iid.FirebaseInstanceId

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}