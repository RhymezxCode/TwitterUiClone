package com.project.twitteruiclone.data.model

data class MentionsListContent (
    var userProfilePicture:Int,
    var userFullName:String,
    var userHandle:String,
    var mentionTime:String,
    var replyingTo:String,
    var mentionContent:String
        )