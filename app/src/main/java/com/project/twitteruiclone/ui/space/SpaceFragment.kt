package com.project.twitteruiclone.ui.space

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.twitteruiclone.databinding.FragmentSpaceBinding
import com.project.twitteruiclone.data.util.Spaces

class SpaceFragment : Fragment() {

    private lateinit var spaceViewModel: SpaceViewModel
    private var _binding: FragmentSpaceBinding? = null
    private lateinit var spaceListAdapter: SpaceListAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSpaceBinding.inflate(inflater, container, false)

        spaceViewModel =
            ViewModelProvider(this).get(SpaceViewModel::class.java)

        spaceListAdapter = SpaceListAdapter()

        val myLinearLayoutManager = object : LinearLayoutManager(requireContext()){
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

        with(binding.listOfSpaceBox) {
            layoutManager = myLinearLayoutManager
            adapter = spaceListAdapter
            spaceListAdapter.notifyDataSetChanged()
        }


        spaceListAdapter.setSpaces(
            requireActivity(),
            Spaces.getSpaces()
        )



//        val textView: TextView = binding.textSpace
//        spaceViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}