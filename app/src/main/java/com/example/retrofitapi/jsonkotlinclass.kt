package com.example.retrofitapi

data class jsonkotlinclass(
val postLink: String,
val subreddit: String,
val title: String,
val url: String,
val nsfw: Boolean,
val spoiler: Boolean,
val author: String,
val ups: Short,
val preview: Array<String>,
)
