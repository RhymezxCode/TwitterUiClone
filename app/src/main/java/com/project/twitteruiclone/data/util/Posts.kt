package com.project.twitteruiclone.data.util

import com.project.twitteruiclone.data.model.PostContent


object Posts {
    private var posts = ArrayList<PostContent>()

    init {
        posts.add(
            PostContent(
                "Jide and 6 others liked",
                "liked",
                "Awodire babajide samuel",
                "@rhymezx_code",
                "12h",
                "Well, making the tweet UI is fun no caps.",
                "300",
                "12k",
                "70k",
                false
            )
        )
        posts.add(
            PostContent(
                "tariq and 3 others liked",
                "liked",
                "Onion Cider",
                "@abbietayo",
                "16h",
                "Men please can we have a picture thread?",
                "3000",
                "10k",
                "170k",
                true
            )
        )
        posts.add(
            PostContent(
                "Joshua Olatunji Retweeted",
                "retweeted",
                "Sofi",
                "@the_odditty",
                "1d",
                "AHHHH Sofi on a billboard at SoFI stadium!!",
                "36",
                "252",
                "2,120",
                false
            )
        )
        posts.add(
            PostContent(
                "gouravkhunger.xyz replied",
                "replied",
                "Avneesh Agarwal",
                "@avneesh0612",
                "1h",
                "Something is cooking",
                "2",
                "1",
                "8",
                true
            )
        )
        posts.add(
            PostContent(
                "Ndiritu Retweeted",
                "retweeted",
                "Philips future",
                "@philipsfuture",
                "10h",
                "I don't like how the stock android Phone app looks like so i made a few UI changes to it.",
                "4",
                "3",
                "33",
                false
            )
        )
        posts.add(
            PostContent(
                "Ndiritu Retweeted",
                "retweeted",
                "Philips future",
                "@philipsfuture",
                "10h",
                "I don't like how the stock android Phone app looks like so i made a few UI changes to it. So" +
                        "I want the long line to show so that the thread is complete on a straight line.",
                "4",
                "3",
                "33",
                true
            )
        )

    }

    fun getPosts(): ArrayList<PostContent>{
        return posts
    }

}