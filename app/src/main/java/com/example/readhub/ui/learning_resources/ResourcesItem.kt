package com.example.readhub.ui.learning_resources

data class ResourcesItem(
    val title: String,
    val author: String,
    val imageUrl: String? = null,
    val content: String,
    val resourceUrl: String? = null,
    val videoUrl: String? = null
)
