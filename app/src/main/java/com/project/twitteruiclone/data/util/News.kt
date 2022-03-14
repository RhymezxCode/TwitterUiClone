package com.project.twitteruiclone.data.util

import com.project.twitteruiclone.data.model.NewsListContent

object News {
    private var news = ArrayList<NewsListContent>()

    init{
        news.add(
            NewsListContent(
            "Trending in Nigeria",
            "Davido",
            "2,000 Tweets"
        )
        )
        news.add(
            NewsListContent(
                "Trending in Nigeria",
                "Ritual",
                "10.8K Tweets"
            )
        )
        news.add(
            NewsListContent(
                "Trending in Nigeria",
                "Boko Haram",
                "3,742 Tweets"
            )
        )
        news.add(
            NewsListContent(
                "Trending in Nigeria",
                "Buhari",
                "8,989 Tweets"
            )
        )
        news.add(
            NewsListContent(
                "Trending in Nigeria",
                "Finished",
                "124K Tweets"
            )
        )
        news.add(
            NewsListContent(
                "Trending in Nigeria",
                "Wizkid",
                "5,555 Tweets"
            )
        )
        news.add(
            NewsListContent(
                "Trending in Nigeria",
                "Messi",
                "10K Tweets"
            )
        )
    }
    fun getNews():ArrayList<NewsListContent>{
        return news
    }
}