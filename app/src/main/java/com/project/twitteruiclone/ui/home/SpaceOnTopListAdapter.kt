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


class SpaceOnTopListAdapter :
    RecyclerView.Adapter<SpaceOnTopListAdapter.SpaceOnTop>() {

    override fun getItemCount(): Int {
        return 5
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpaceOnTop {
        val listItem =
            LayoutInflater.from(parent.context).inflate(R.layout.spaces_on_top, parent, false)
        return SpaceOnTop(listItem)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: SpaceOnTop, position: Int) {




    }


    inner class SpaceOnTop(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        //Declaration of space_box.xml variables
        val totalNumber: TextView = itemView.findViewById(R.id.total_number)
        val firstImage: ImageView = itemView.findViewById(R.id.profile_image_1)
        val secondImage: ImageView = itemView.findViewById(R.id.profile_image_2)
        val thirdImage: ImageView = itemView.findViewById(R.id.profile_image_3)
    }


}