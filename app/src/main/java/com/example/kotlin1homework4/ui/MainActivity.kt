package com.example.kotlin1homework4.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.kotlin1homework4.R
import com.example.kotlin1homework4.ui.FirstFragment.FirstFragment
import com.example.kotlin1homework4.ui.SecondFragment.SecondFragment
import com.example.kotlin1homework4.ui.ThreethFragment.ThreethFragment

class MainActivity : FragmentActivity() {

    private lateinit var adapter: VPAdapter
    private lateinit var viewPager: ViewPager2

    private val list = arrayListOf(FirstFragment(), SecondFragment(), ThreethFragment())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = VPAdapter(this,list)
        viewPager = findViewById(R.id.mainViewPager)
        viewPager.adapter = adapter
    }

}