package ru.com.bulat.daggerhiltlesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import ru.com.bulat.daggerhiltlesson.frags.Activity2
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var wifiManager: WiFiManager
    val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("AAA", "Main activity instance Id: $wifiManager")
        mainViewModel.connect()
        startActivity(Intent(this, Activity2::class.java))
    }
}