package com.project.twitteruiclone.ui.space

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.project.twitteruiclone.databinding.FragmentSpaceBinding

class SpaceFragment : Fragment() {

    private lateinit var spaceViewModel: SpaceViewModel
    private var _binding: FragmentSpaceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        spaceViewModel =
            ViewModelProvider(this).get(SpaceViewModel::class.java)

        _binding = FragmentSpaceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSpace
        spaceViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}