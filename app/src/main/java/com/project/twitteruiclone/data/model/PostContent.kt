package com.project.twitteruiclone.data.model

data class PostContent(
    var contributorInfo: String,
    var status: String,
    var fullName: String,
    var username: String,
    var hours: String,
    var fullPost: String,
    var noOfComment: String,
    var noOfRetweet: String,
    var noOfLike: String,
    var hasThread: Boolean
)
