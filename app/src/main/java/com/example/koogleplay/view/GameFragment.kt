package com.example.koogleplay.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.koogleplay.R
import com.example.koogleplay.model.Feed
import com.example.koogleplay.model.feed
import com.example.koogleplay.view.adapter.ForYouVerticalAdapter
import com.google.gson.Gson

class GameFragment: Fragment() {

    private var forYouVerticalAdapter : ForYouVerticalAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        forYouVerticalAdapter = ForYouVerticalAdapter()
        view.findViewById<RecyclerView>(R.id.rv_vertical).adapter = forYouVerticalAdapter
        requestForYou()
    }

    private fun requestForYou() {
        Thread {
            Thread.sleep(1000)
            val feed: Feed = Gson().fromJson(feed(), Feed::class.java)

            activity?.runOnUiThread {
                forYouVerticalAdapter?.add(feed.categories)
            }
        }.start()
    }
}