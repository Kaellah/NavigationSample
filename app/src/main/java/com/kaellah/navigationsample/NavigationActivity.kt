package com.kaellah.navigationsample

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.navigation.NavigationView
import com.kaellah.navigationsample.interfaces.NavigationListener
import kotlinx.android.synthetic.main.activity_navigation.*
import kotlinx.android.synthetic.main.app_bar_navigation.*

class NavigationActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener,
    NavigationListener {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        setSupportActionBar(toolbar)

        navController = Navigation.findNavController(this, R.id.nav_fragment)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                navController.navigate(R.id.homeFragment)
            }
            R.id.nav_chat -> {
                navController.navigate(R.id.action_homeFragment_to_chatFragment)
            }
            R.id.nav_profile -> {
                navController.navigate(R.id.action_homeFragment_to_profileFragment)
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun navigateTo(destination: Destination) {
        when (destination) {
            is Home -> navController.navigate(R.id.homeFragment)
            is Profile -> navController.navigate(R.id.action_homeFragment_to_profileFragment)
            is Chat -> navController.navigate(R.id.action_homeFragment_to_chatFragment)
            is ChatList -> navController.navigate(R.id.action_chatFragment_to_chatListFragment)
        }
    }

    override fun backPressed() {
        navController.popBackStack()
    }
}
