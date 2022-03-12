package com.project.twitteruiclone.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.NewsListContent

class NewsListAdapter: RecyclerView.Adapter<NewsListAdapter.NewsViewHolder>() {

    private var dataset: ArrayList<NewsListContent> = ArrayList()

    inner class NewsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val trending: TextView = itemView.findViewById(R.id.trending_textview)
        val nameOfTrend: TextView = itemView.findViewById(R.id.name_of_trend_textview)
        val noOfTweets: TextView = itemView.findViewById(R.id.no_of_tweets_textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.news_list_item, parent, false)
        return NewsViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = dataset[position]
        holder.trending.text = item.trending
        holder.nameOfTrend.text = item.nameOfTrend
        holder.noOfTweets.text = item.noOfTweets
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}