package com.kaellah.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kaellah.navigationsample.interfaces.NavigationListener
import kotlinx.android.synthetic.main.fragment_chat_list.*

class ChatListFragment: Fragment() {

    private val callback by lazy {
        activity as? NavigationListener
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return View.inflate(context, R.layout.fragment_chat_list, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        back.setOnClickListener {
            callback?.backPressed()
        }
    }
}