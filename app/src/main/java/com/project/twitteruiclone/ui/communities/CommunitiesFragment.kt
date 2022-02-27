package com.project.twitteruiclone.ui.communities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.project.twitteruiclone.databinding.FragmentCommunitiesBinding

class CommunitiesFragment : Fragment() {

    private lateinit var communitiesViewModel: CommunitiesViewModel
    private var _binding: FragmentCommunitiesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        communitiesViewModel =
            ViewModelProvider(this).get(CommunitiesViewModel::class.java)

        _binding = FragmentCommunitiesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCommunities
        communitiesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}