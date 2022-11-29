package com.project.twitteruiclone.ui.notification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.twitteruiclone.data.util.Mentions
import com.project.twitteruiclone.databinding.FragmentMentionsBinding


class MentionsFragment : Fragment() {
    private var _binding: FragmentMentionsBinding? = null
    private lateinit var mentionsListAdapter: MentionsListAdapter
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentMentionsBinding.inflate(inflater, container, false)
        mentionsListAdapter = MentionsListAdapter()
        val myLinearLayoutManager = object : LinearLayoutManager(requireContext()){
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

        with(binding.mentionsList) {
            layoutManager = myLinearLayoutManager
            adapter = mentionsListAdapter
            mentionsListAdapter.notifyDataSetChanged()
        }

        mentionsListAdapter.setMentions(
            requireActivity(),
            Mentions.getMentions()
        )

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}