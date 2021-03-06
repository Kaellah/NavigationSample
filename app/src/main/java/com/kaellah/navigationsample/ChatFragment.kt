package com.kaellah.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class ChatFragment : Fragment() {

    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
//        btnProfile.setOnClickListener {
//            navController.navigate()
//        }
//        btnChat.setOnClickListener {
//            navController.navigate()
//        }
//        btnSettings.setOnClickListener {
//            navController.navigate()
//        }
    }
}