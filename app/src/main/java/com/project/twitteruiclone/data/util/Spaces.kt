package com.project.twitteruiclone.data.util

import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.SpaceContent

object Spaces {
    private var spaces = ArrayList<SpaceContent>()

    init {
        spaces.add(
            SpaceContent(
                "#ff7856ff",
                "#ff7856ff",
                "Let us hang out here!!!",
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                "Samuel",
                "I'm just flexing",
                R.drawable.img1,
                "300",
                "Sodiq"
            )
        )
        spaces.add(
            SpaceContent(
                "#fff91880",
                "#fff91880",
                "Who dey breathe!!!",
                R.drawable.img4,
                R.drawable.img5,
                R.drawable.img6,
                "Olisemeka",
                "I love football, yes",
                R.drawable.img5,
                "600",
                "Samuel"
            )
        )
        spaces.add(
            SpaceContent(
                "#ff31c88e",
                "#ff31c88e",
                "Let talk about other things now!",
                R.drawable.img7,
                R.drawable.img8,
                R.drawable.img9,
                "Femi",
                "Wetin you dey look gan",
                R.drawable.img9,
                "100",
                "Victory"
            )
        )
        spaces.add(
            SpaceContent(
                "#ffff7a00",
                "#ffff7a00",
                "Android dev meet up",
                R.drawable.img10,
                R.drawable.img11,
                R.drawable.img13,
                "Madonna",
                "Android dev",
                R.drawable.img13,
                "700",
                "Ronnie"
            )
        )
        spaces.add(
            SpaceContent(
                "#ff92643e",
                "#ff92643e",
                "Private Space, don't enter",
                R.drawable.img16,
                R.drawable.img17,
                R.drawable.img18,
                "Ronke",
                "I hate life so much",
                R.drawable.img14,
                "10",
                "Rinu"
            )
        )
        spaces.add(
            SpaceContent(
                "#ffd55548",
                "#ffd55548",
                "Ukraine vs Putin",
                R.drawable.img19,
                R.drawable.img16,
                R.drawable.img17,
                "Imam of Peace",
                "I hate war",
                R.drawable.img20,
                "900",
                "Tiana"
            )
        )
    }

    fun getSpaces(): ArrayList<SpaceContent>{
        return spaces
    }

}