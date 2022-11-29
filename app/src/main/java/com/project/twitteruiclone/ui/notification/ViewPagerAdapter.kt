package com.project.twitteruiclone.ui.notification

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2


    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> { AllFragment() }
            1 -> { MentionsFragment() }
            else -> { throw Resources.NotFoundException("Position Not Found") }
        }
    }


}