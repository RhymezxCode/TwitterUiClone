package com.project.twitteruiclone.data.util

import com.project.twitteruiclone.R
import com.project.twitteruiclone.data.model.MessageListContent

object Messages{
    private var messages = ArrayList<MessageListContent>()

    init{
        messages.add(
            MessageListContent(
                R.drawable.img20,
                "Phillip Bardsley",
                "bardzo",
                "1h",
                "Hello, how are you doing today?"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img13,
                "Kevin De Bruyne",
                "theRealKDB",
                "2h",
                "How may I assist you?"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img10,
                "Tunde Omotoye",
                "TundeTASH",
                "3h",
                "When will you come to Canada, boss?"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img2,
                "Ramy Bansebaini",
                "ramybansebainihadour",
                "6h",
            "I am Bansebaini, footballer in the German league with Borussia Monchengladbach and the Algerian National team. Also AFCOM winner in 2019"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img12,
                "That Tech Dude",
                "thattech_dude",
                "1d",
                "Model, View, Controller"

            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img17,
                "Ronald Koeman",
                "RonaldKoeman",
                "1d",
                "I used to play for Barcelona"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img5,
                "Ebenezer Don",
                "da_code_don",
                "2d",
                "Patience is the fastest route. You have plenty of time"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img6,
                "Naruto",
                "thelastuzumaki",
                "3d",
                "Dattebayo"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img8,
                "Kylian Mbappe",
                "adesanmi_mbappe",
                "15 Mar",
                "I play with Messi but Ronaldo is the GOAT"
            )
        )

        messages.add(
            MessageListContent(
                R.drawable.img9,
                "Nagato Uzumaki",
                "chinratensei",
                "01 Mar",
                "Pein Rikudo Rokunin Kenzan!"
            )
        )
    }

    fun getMessages(): ArrayList<MessageListContent>{
        return messages
    }
}