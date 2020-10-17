package com.max.ecloudmobile.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.max.ecloudmobile.home.item.first.FirstFragment
import com.max.ecloudmobile.home.item.second.SecondFragment
import com.max.ecloudmobile.home.item.third.ThirdFragment

class HomeAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val fragmentMap = mutableMapOf<Int, Fragment>()

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                val fragment = FirstFragment()
                fragmentMap[position] = fragment
                fragment
            }
            1 -> {
                val fragment = SecondFragment()
                fragmentMap[position] = fragment
                fragment
            }
            else -> {
                val fragment = ThirdFragment()
                fragmentMap[position] = fragment
                fragment
            }
        }
    }

    override fun getCount(): Int = 3

}