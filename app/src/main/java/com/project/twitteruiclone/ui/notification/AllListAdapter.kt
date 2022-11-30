package com.project.twitteruiclone.ui.notification

import android.annotation.SuppressLint
import android.app.Activity
import android.text.SpannableStringBuilder
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.bold
import androidx.recyclerview.widget.RecyclerView
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.AllListContent
import de.hdodenhof.circleimageview.CircleImageView

class AllListAdapter: RecyclerView.Adapter<AllListAdapter.AllViewHolder>() {

    private var dataset: ArrayList<AllListContent> = ArrayList()
    private var activity: Activity? = Activity()

    @SuppressLint("NotifyDataSetChanged")
    fun setAll(activity: Activity, Transactions: ArrayList<AllListContent>){
        this.dataset = Transactions
        this.activity = activity
        this.notifyDataSetChanged()
    }

    class AllViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val actionIcon: ImageView = itemView.findViewById(R.id.action_icon)
        val userProfilePicture: CircleImageView = itemView.findViewById(R.id.user_profile_picture)
        val actionText: TextView = itemView.findViewById(R.id.action_text)
        val actionContent: TextView = itemView.findViewById(R.id.action_content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllViewHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.all_list_item, parent, false)
        return AllViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: AllViewHolder, position: Int) {
        val item = dataset[position]
        when (item.action){
            "like" -> {
                holder.actionIcon.setImageResource(R.drawable.ic_heart_red)
                holder.actionText.text = SpannableStringBuilder().bold{append(item.userName)}
                    .append(" liked your Tweet")
                holder.actionContent.text = item.actionContent
            }
            "retweet" -> {
                holder.actionIcon.setImageResource(R.drawable.ic_stat_retweet)
                holder.actionText.text = SpannableStringBuilder().bold{append(item.userName)}
                    .append(" Retweeted your Tweet")
                holder.actionContent.text = item.actionContent
            }
            "tweet notification" -> {
                holder.actionIcon.setImageResource(R.drawable.notification)
                holder.actionText.text = SpannableStringBuilder().append("New Tweet Notification for ")
                    .bold{append(item.userName)}
                holder.actionContent.visibility = GONE
            }
        }
        holder.userProfilePicture.setImageResource(item.userProfilePicture)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}