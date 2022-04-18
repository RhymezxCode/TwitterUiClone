package com.project.twitteruiclone.ui.message

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.twitteruiclone.data.util.Messages
import com.project.twitteruiclone.data.util.News
import com.project.twitteruiclone.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {

    private lateinit var messageViewModel: MessageViewModel
    private var _binding: FragmentMessageBinding? = null
    private lateinit var messageListAdapter: MessageListAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        messageViewModel =
            ViewModelProvider(this).get(MessageViewModel::class.java)

        _binding = FragmentMessageBinding.inflate(inflater, container, false)

        messageListAdapter = MessageListAdapter()

        val myLinearLayoutManager = object : LinearLayoutManager(requireContext()){
            override fun canScrollVertically(): Boolean {
                return false
            }
        }

        with(binding.messageList) {
            layoutManager = myLinearLayoutManager
            adapter = messageListAdapter
            messageListAdapter.notifyDataSetChanged()
        }

        messageListAdapter.setMessage(
            requireActivity(),
            Messages.getMessages()
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}