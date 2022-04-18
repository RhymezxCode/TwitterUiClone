package com.project.twitteruiclone.data.util

import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.AllListContent

object All {

    private var all = ArrayList<AllListContent>()

    init{
        all.add(
            AllListContent(
                "like",
                R.drawable.teta,
                "Mikel Arteta",
                "Mikel Arteta gave an honest assessment of our performance after we slumped to a disappointing defeat against Southampton on Saturday."
            )
        )

        all.add(
            AllListContent(
                "retweet",
                R.drawable.teta,
                "Mikel Arteta",
                "Mikel Arteta gave an honest assessment of our performance after we slumped to a disappointing defeat against Southampton on Saturday."
            )
        )

        all.add(
            AllListContent(
             "like",
             R.drawable.img5,
             "Mr. Miyagi",
             "Moon Knight is a top-tier series. No cap."
            )
        )

        all.add(
            AllListContent(
                "tweet notification",
                R.drawable.img17,
                "Madona Syombua",
                ""
            )
        )

        all.add(
            AllListContent(
                "retweet",
                R.drawable.img20,
                "Mason Gray",
                "Android development is so much fun"
            )
        )

        all.add(
            AllListContent(
                "like",
                R.drawable.img16,
                "Drago",
                "This issue will now rest on android developers...." +
                        "" +
                        "CTO will say, users are complaining the push notifications are not working, fix it.... "
            )
        )

        all.add(
            AllListContent(
                "tweet notification",
                R.drawable.stephenamell,
                "Oliver Queen",
                ""
            )
        )
    }

    fun getAll(): ArrayList<AllListContent>{
        return all
    }
}

