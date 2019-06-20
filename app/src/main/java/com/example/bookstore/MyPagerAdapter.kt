package com.example.bookstore

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    val pageNumber = 3

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()

            else -> FragmentOne()
        }


    }

    override fun getPageTitle(position: Int): CharSequence? {
        return  when(position) {
            0 -> "Top"
            1 -> "Children"
            2 -> "Fiction"

            else -> ""
        }
    }

    override fun getCount(): Int {
        return pageNumber
    }
}