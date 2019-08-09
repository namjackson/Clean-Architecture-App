package com.namjackson.arch.sample.view.ui

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.namjackson.arch.sample.R
import com.namjackson.arch.sample.databinding.ActivityMainBinding
import com.namjackson.arch.sample.view.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_container) as NavHostFragment? ?: return

        binding.navView.setupWithNavController(host.navController)
    }

}
