package com.project.twitteruiclone.ui.notification

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.project.twitteruiclone.R
import com.project.twitteruiclone.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {

    private lateinit var notificationViewModel: NotificationViewModel
    private var _binding: FragmentNotificationBinding? = null
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationViewModel =
            ViewModelProvider(this).get(NotificationViewModel::class.java)

        _binding = FragmentNotificationBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabLayout = binding.tabLayout
        val viewPager = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager){tab, index ->
            tab.text =  when (index){
                0 ->"All"
                1 ->"Mentions"
                else -> throw Resources.NotFoundException("Position Not Found")
            }
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}