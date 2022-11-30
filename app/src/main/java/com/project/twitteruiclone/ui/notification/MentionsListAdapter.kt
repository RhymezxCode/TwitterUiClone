package com.project.twitteruiclone.ui.notification

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.MentionsListContent
import de.hdodenhof.circleimageview.CircleImageView

class MentionsListAdapter: RecyclerView.Adapter<MentionsListAdapter.MentionsViewHolder>()  {
    private var dataset: ArrayList<MentionsListContent> = ArrayList()
    private var activity: Activity? = Activity()

    fun setMentions(activity: Activity, Transactions: ArrayList<MentionsListContent>){
        this.dataset = Transactions
        this.activity = activity
        this.notifyDataSetChanged()
    }
    class MentionsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val userProfilePicture: CircleImageView = itemView.findViewById(R.id.profile_picture)
        val userFullName: TextView = itemView.findViewById(R.id.user_full_name)
        val userHandle: TextView = itemView.findViewById(R.id.user_handle)
        val mentionTime: TextView = itemView.findViewById(R.id.time_of_mention)
        val replyingTo: TextView = itemView.findViewById(R.id.reply)
        val mentionContent: TextView = itemView.findViewById(R.id.mention_content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MentionsViewHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.mentions_list_item, parent, false)
        return MentionsListAdapter.MentionsViewHolder(listItem)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MentionsViewHolder, position: Int) {
        val item = dataset[position]
        holder.userProfilePicture.setImageResource(item.userProfilePicture)
        holder.userFullName.text = item.userFullName
        holder.userHandle.text = "@${item.userHandle}"
        holder.mentionTime.text = item.mentionTime
        holder.replyingTo.text = "Replying to ${item.replyingTo}"
        holder.mentionContent.text = item.mentionContent
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}