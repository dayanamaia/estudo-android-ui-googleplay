package com.example.koogleplay.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.koogleplay.R
import com.example.koogleplay.model.GamesType
import com.example.koogleplay.view.adapter.FragmentTypeAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.frag_view_pager.adapter =
            FragmentTypeAdapter(this)
        view.frag_view_pager.isUserInputEnabled = false

        TabLayoutMediator(view.tab_layout, view.frag_view_pager) { tab, position ->
            tab.text = GamesType.values()[position].label
        }.attach()

    }
}


