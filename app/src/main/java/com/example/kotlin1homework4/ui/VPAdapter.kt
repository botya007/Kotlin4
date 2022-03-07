package com.example.kotlin1homework4.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kotlin1homework4.ui.FirstFragment.FirstFragment
import com.example.kotlin1homework4.ui.SecondFragment.SecondFragment
import com.example.kotlin1homework4.ui.ThreethFragment.ThreethFragment
import org.w3c.dom.DocumentFragment

class VPAdapter(fragment: FragmentActivity, var list: ArrayList<Fragment>) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment = list[position]
}