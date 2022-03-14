package com.project.twitteruiclone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.twitteruiclone.data.util.Posts
import com.project.twitteruiclone.data.util.Spaces
import com.project.twitteruiclone.databinding.FragmentHomeBinding
import com.project.twitteruiclone.ui.space.SpaceListAdapter

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private lateinit var homeListAdapter: HomeListAdapter
    private lateinit var spaceOnTopListAdapter: SpaceOnTopListAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        homeListAdapter = HomeListAdapter()
        spaceOnTopListAdapter = SpaceOnTopListAdapter()

        val myLinearLayoutManager = object : LinearLayoutManager(requireContext()){
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

        with(binding.listOfPost) {
            layoutManager = myLinearLayoutManager
            adapter = homeListAdapter
            homeListAdapter.notifyDataSetChanged()
        }
        with(binding.listOfSpacesOnTop) {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = spaceOnTopListAdapter
            spaceOnTopListAdapter.notifyDataSetChanged()
        }

        homeListAdapter.setPosts(
            requireActivity(),
            Posts.getPosts()
        )
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}