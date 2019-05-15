package com.kaellah.navigationsample.interfaces

import com.kaellah.navigationsample.Destination

interface NavigationListener {

    fun navigateTo(destination: Destination)

    fun backPressed()
}