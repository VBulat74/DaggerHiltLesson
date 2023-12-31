package ru.com.bulat.daggerhiltlesson.frags

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.com.bulat.daggerhiltlesson.R
import ru.com.bulat.daggerhiltlesson.WiFiManager
import ru.com.bulat.daggerhiltlesson.databinding.Activity2Binding
import javax.inject.Inject

@AndroidEntryPoint
class Activity2 : AppCompatActivity() {

    @Inject
    lateinit var wifiManager: WiFiManager

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        Log.d("AAA", "Activity2 instance Id: $wifiManager")

        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_2)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAnchorView(R.id.fab)
                .setAction("Action", null).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_2)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}