package com.project.twitteruiclone.ui.home

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.PostContent
import kotlin.collections.ArrayList


class HomeListAdapter :
    RecyclerView.Adapter<HomeListAdapter.PostHolder>() {
    private var allPosts: ArrayList<PostContent> = ArrayList()
    private var activity: Activity? = Activity()

    fun setPosts(activity: Activity, Transactions: ArrayList<PostContent>) {
        this.allPosts = Transactions
        this.activity = activity
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return allPosts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val listItem =
            LayoutInflater.from(parent.context).inflate(R.layout.post, parent, false)
        return PostHolder(listItem)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        val eachPost = allPosts[position]
        when {
            eachPost.status == "liked" -> {
                holder.contributorIcon.setImageResource(R.drawable.ic_stat_heart)
            }
            eachPost.status == "retweeted" -> {
                holder.contributorIcon.setImageResource(R.drawable.ic_stat_retweet)
            }
            eachPost.status == "replied" -> {
                holder.contributorIcon.setImageResource(R.drawable.ic_stat_notify_reply)
            }
            eachPost.hasThread -> {
                holder.threadLine.visibility = View.VISIBLE
                holder.showThread.visibility = View.VISIBLE
                holder.threadUserPhoto.visibility = View.VISIBLE
                holder.postImageCard.visibility = View.GONE
            }
            !eachPost.hasThread -> {
                holder.threadLine.visibility = View.GONE
                holder.showThread.visibility = View.GONE
                holder.threadUserPhoto.visibility = View.GONE
            }
        }
        holder.contributorInfo.text = eachPost.contributorInfo
        holder.fullName.text = eachPost.fullName
        holder.username.text = eachPost.username
        holder.hour.text = eachPost.hours
        holder.fullPost.text = eachPost.fullPost
        holder.noOfComment.text = eachPost.noOfComment
        holder.noOfRetweet.text = eachPost.noOfRetweet
        holder.noOfLike.text = eachPost.noOfLike
        holder.contributorInfo.text = eachPost.contributorInfo


    }


    inner class PostHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        //Declaration of space_box.xml variables
        val contributorInfo: TextView = itemView.findViewById(R.id.contributor_info)
        val contributorIcon: ImageView = itemView.findViewById(R.id.contributor_icon)
        val userPhoto: ImageView = itemView.findViewById(R.id.profile_image_1)
        val threadUserPhoto: ImageView = itemView.findViewById(R.id.profile_image_2)
        val fullName: TextView = itemView.findViewById(R.id.full_name)
        val username: TextView = itemView.findViewById(R.id.username)
        val hour: TextView = itemView.findViewById(R.id.hours)
        val fullPost: TextView = itemView.findViewById(R.id.full_post)
        val threadLine: View = itemView.findViewById(R.id.thread_line)
        val postImage: ImageView = itemView.findViewById(R.id.post_image)
        val postImageCard: CardView = itemView.findViewById(R.id.post_image_card)
        val noOfComment: TextView = itemView.findViewById(R.id.number_of_comment)
        val noOfRetweet: TextView = itemView.findViewById(R.id.number_of_retweet)
        val noOfLike: TextView = itemView.findViewById(R.id.number_of_like)
        val showThread: TextView = itemView.findViewById(R.id.show_thread)
    }


}