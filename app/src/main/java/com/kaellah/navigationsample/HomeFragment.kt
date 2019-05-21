package com.kaellah.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btnProfile.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_profileFragment)
        }
        btnChat.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_chatFragment)
        }
        btnSettings.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_settingsFragment)
        }
    }
}