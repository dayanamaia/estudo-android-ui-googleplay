package com.example.koogleplay.view

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.koogleplay.model.GamesType

class FragmentTypeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return GamesType.values().size
    }

    override fun createFragment(position: Int): Fragment {
        return GameFragment()
    }

}
