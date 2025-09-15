package com.example.readhub.ui.learning_resources

data class ResourcesItem(
    val title: String,
    val author: String,
    val image: Int? = null,
    val description: String,
    val resourceUrl: String? = null,
    val videoUrl: String? = null
)
