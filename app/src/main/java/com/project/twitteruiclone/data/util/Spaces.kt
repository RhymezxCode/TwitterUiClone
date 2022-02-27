package com.project.twitteruiclone.data.util

import com.project.twitteruiclone.data.model.SpaceContent

object Spaces {
    private var spaces = ArrayList<SpaceContent>()

    init {
        spaces.add(
            SpaceContent(
                "#ff7856ff",
                "#ff7856ff",
                "Let us hang out here!!!",
                "Samuel",
                "I'm just flexing",
                "300",
                "Sodiq"
            )
        )
        spaces.add(
            SpaceContent(
                "#fff91880",
                "#fff91880",
                "Who dey breathe!!!",
                "Olisemeka",
                "I love football, yes",
                "600",
                "Samuel"
            )
        )
        spaces.add(
            SpaceContent(
                "#ff31c88e",
                "#ff31c88e",
                "Let talk about other things now!",
                "Femi",
                "Wetin you dey look gan",
                "100",
                "Victory"
            )
        )
        spaces.add(
            SpaceContent(
                "#ffff7a00",
                "#ffff7a00",
                "Android dev meet up",
                "Madonna",
                "Android dev",
                "700",
                "Ronnie"
            )
        )
        spaces.add(
            SpaceContent(
                "#ff92643e",
                "#ff92643e",
                "Private Space, don't enter",
                "Ronke",
                "I hate life so much",
                "10",
                "Rinu"
            )
        )
        spaces.add(
            SpaceContent(
                "#ffd55548",
                "#ffd55548",
                "Ukraine vs Putin",
                "Imam of Peace",
                "I hate war",
                "900",
                "Tiana"
            )
        )
    }

    fun getSpaces(): ArrayList<SpaceContent>{
        return spaces
    }

}