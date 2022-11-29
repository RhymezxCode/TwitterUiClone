package com.project.twitteruiclone.data.util

import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.MentionsListContent
import com.project.twitteruiclone.data.model.MessageListContent

object Mentions {

    private var mentions = ArrayList<MentionsListContent>()

    init {
        mentions.add(
            MentionsListContent(
                R.drawable.img20,
                "Phillip Bardsley",
                "bardzo",
                "1h",
                "@king_kong",
                "Hello, how are you doing today?"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img13,
                "Kevin De Bruyne",
                "theRealKDB",
                "2h",
                "@king_kong",
                "How may I assist you?"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img10,
                "Tunde Omotoye",
                "TundeTASH",
                "3h",
                "@king_kong",
                "When will you come to Canada, boss?"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img2,
                "Ramy Bansebaini",
                "ramybansebainihadour",
                "6h",
                "@king_kong",
                "I am Bansebaini, footballer in the German league with Borussia Monchengladbach and the Algerian National team. Also AFCOM winner in 2019"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img12,
                "That Tech Dude",
                "thattech_dude",
                "1d",
                "@king_kong",
                "Model, View, Controller"

            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img17,
                "Ronald Koeman",
                "RonaldKoeman",
                "1d",
                "@king_kong",
                "I used to play for Barcelona"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img5,
                "Ebenezer Don",
                "da_code_don",
                "2d",
                "@king_kong",
                "Patience is the fastest route. You have plenty of time"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img6,
                "Naruto",
                "thelastuzumaki",
                "3d",
                "@king_kong",
                "Dattebayo"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img8,
                "Kylian Mbappe",
                "adesanmi_mbappe",
                "15 Mar",
                "@king_kong",
                "I play with Messi but Ronaldo is the GOAT"
            )
        )

        mentions.add(
            MentionsListContent(
                R.drawable.img9,
                "Nagato Uzumaki",
                "chinratensei",
                "01 Mar",
                "@king_kong",
                "Pein Rikudo Rokunin Kenzan!"
            )
        )
    }

    fun getMentions(): ArrayList<MentionsListContent> {
        return Mentions.mentions
    }
}