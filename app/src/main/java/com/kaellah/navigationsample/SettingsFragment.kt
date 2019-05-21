package com.kaellah.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment() {

    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        btnProfile.setOnClickListener {
            val bundle = bundleOf("userName" to "Sundar Pichai")

            navController.navigate(R.id.action_settingsFragment_to_profileFragment, bundle)
        }
//        btnChat.setOnClickListener {
//            navController.navigate()
//        }
//        btnSettings.setOnClickListener {
//            navController.navigate()
//        }
    }
}