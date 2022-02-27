package com.project.twitteruiclone.ui.space

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.SpaceContent
import kotlin.collections.ArrayList


class SpaceListAdapter :
    RecyclerView.Adapter<SpaceListAdapter.SpaceHolder>() {
    private var allSpaces: ArrayList<SpaceContent> = ArrayList()
    private var activity: Activity? = Activity()

    fun setSpaces(activity: Activity, Transactions: ArrayList<SpaceContent>) {
        this.allSpaces = Transactions
        this.activity = activity
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return allSpaces.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpaceHolder {
        val listItem =
            LayoutInflater.from(parent.context).inflate(R.layout.space_box, parent, false)
        return SpaceHolder(listItem)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: SpaceHolder, position: Int) {
        val eachSpace = allSpaces[position]

        holder.spaceBox.setCardBackgroundColor(Color.parseColor(eachSpace.spaceBoxColor))
        holder.host.setCardBackgroundColor(Color.parseColor(eachSpace.hostColor))
        holder.spaceName.text = eachSpace.spaceName
        holder.spaceHostName.text = eachSpace.spaceHostName
        holder.spaceHostBio.text = eachSpace.spaceHostBio
        val totalListeners = eachSpace.noOfListeners
        holder.noOfListeners.text = " $totalListeners listening"
        val who = eachSpace.whoIsTalking
        holder.talkingInSpace.text = " $who is talking"
    }


    inner class SpaceHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        //Declaration of space_box.xml variables
        val spaceBox: CardView = itemView.findViewById(R.id.space_box)
        val host: CardView = itemView.findViewById(R.id.host)
        val spaceName: TextView = itemView.findViewById(R.id.space_name)
        val spaceHostName: TextView = itemView.findViewById(R.id.space_host_name)
        val spaceHostBio: TextView = itemView.findViewById(R.id.space_host_bio)
        val noOfListeners: TextView = itemView.findViewById(R.id.no_of_listeners)
        val talkingInSpace: TextView = itemView.findViewById(R.id.talking_in_space)
    }


}