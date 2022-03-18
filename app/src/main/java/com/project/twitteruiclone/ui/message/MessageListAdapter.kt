package com.project.twitteruiclone.ui.message

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.MessageListContent
import de.hdodenhof.circleimageview.CircleImageView

class MessageListAdapter: RecyclerView.Adapter<MessageListAdapter.MessageViewHolder>() {

    private var dataset: ArrayList<MessageListContent> = ArrayList()
    private var activity: Activity? = Activity()

    fun setMessage(activity: Activity, Transactions: ArrayList<MessageListContent>) {
        this.dataset = Transactions
        this.activity = activity
        this.notifyDataSetChanged()
    }


    class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val userProfilePicture: CircleImageView = itemView.findViewById(R.id.user_profile_picture)
        val userFullName: TextView = itemView.findViewById(R.id.user_full_name)
        val userHandle: TextView = itemView.findViewById(R.id.user_handle)
        val messageTime: TextView = itemView.findViewById(R.id.time_of_message)
        val messageBody: TextView = itemView.findViewById(R.id.message_content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.message_list_item, parent, false)
        return MessageViewHolder(listItem)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val item = dataset[position]
        holder.userProfilePicture.setImageResource(item.userProfilePicture)
        holder.userFullName.text = item.userFullName
        holder.userHandle.text = "@${item.userHandle}"
        holder.messageTime.text = item.messageTime
        holder.messageBody.text = item.messageContent
    }

    override fun getItemCount(): Int {
        return dataset.size
    }


}