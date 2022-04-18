package com.project.twitteruiclone.ui.notification

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.util.All
import com.project.twitteruiclone.databinding.FragmentAllBinding


class AllFragment : Fragment() {
    private var _binding: FragmentAllBinding? = null
    private lateinit var allListAdapter: AllListAdapter
    private val binding get() = _binding!!

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAllBinding.inflate(inflater, container, false)
        allListAdapter = AllListAdapter()
        val myLinearLayoutManager = object : LinearLayoutManager(requireContext()){
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

        with(binding.allList){
            layoutManager = myLinearLayoutManager
            adapter = allListAdapter
            allListAdapter.notifyDataSetChanged()
        }

        allListAdapter.setAll(
            requireActivity(),
            All.getAll()
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}