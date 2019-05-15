package com.kaellah.navigationsample

sealed class Destination
object Home : Destination()
object Profile : Destination()
object Chat : Destination()
object ChatList : Destination()