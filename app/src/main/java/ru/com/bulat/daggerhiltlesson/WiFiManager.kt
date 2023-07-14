package ru.com.bulat.daggerhiltlesson

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

class WiFiManager (private val settings: WiFiSettings) {
    fun connect(){
        settings.openConnection()
    }

    fun sendMessage(){
        settings.writeBites()
    }
}

class WiFiSettings {
    fun openConnection(){
        Log.d("AAA", "Connected")
    }

    fun writeBites(){
        Log.d("AAA", "Sending message")
    }
}