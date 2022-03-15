package com.project.twitteruiclone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.util.Posts
import com.project.twitteruiclone.databinding.FragmentHomeBinding

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

        val myPostLinearLayoutManager = object : LinearLayoutManager(requireContext()){
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

        val mySpaceLinearLayoutManager = LinearLayoutManager(requireContext())
        mySpaceLinearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val divider = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        ContextCompat.getDrawable(requireContext(), R.drawable.line)
            ?.let { divider.setDrawable(it) }
        binding.listOfPost.addItemDecoration(divider)

        with(binding.listOfPost) {
            layoutManager = myPostLinearLayoutManager
            adapter = homeListAdapter
            homeListAdapter.notifyDataSetChanged()
        }
        with(binding.listOfSpacesOnTop) {
            layoutManager = mySpaceLinearLayoutManager
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