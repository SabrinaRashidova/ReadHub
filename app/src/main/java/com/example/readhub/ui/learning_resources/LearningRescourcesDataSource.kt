package com.example.readhub.ui.learning_resources

import android.content.Context
import com.example.readhub.R


//    val title: String,
//    val author: String,
//    val image: Int? = null,
//    val content: String,
//    val resourceUrl: String? = null,
//    val videoUrl: String? = null

object LearningRescourcesDataSource {
    val rescourceItems = mutableListOf<ResourcesItem>()

    fun getItems(context: Context): List<ResourcesItem> {
        if (rescourceItems.isNotEmpty()) return rescourceItems

        for (i in 0..3){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                videoUrl = "https://www.youtube.com/watch?v=kKvK2foOTJM"
            ))
        }

        for (i in 0..2){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                resourceUrl = "https://www.kalzumeus.com"
            ))
        }

        for (i in 0..3){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                videoUrl = "https://www.youtube.com/watch?v=kKvK2foOTJM"
            ))
        }

        for (i in 0..2){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                resourceUrl = "https://www.kalzumeus.com"
            ))
        }

        for (i in 0..3){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                videoUrl = "https://www.youtube.com/watch?v=kKvK2foOTJM"
            ))
        }

        for (i in 0..2){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                resourceUrl = "https://www.kalzumeus.com"
            ))
        }

        for (i in 0..3){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                videoUrl = "https://www.youtube.com/watch?v=kKvK2foOTJM"
            ))
        }

        for (i in 0..2){
            rescourceItems.add(ResourcesItem(
                title = "Here should be title",
                author = "Here should be author",
                image = R.drawable.tutorial_img,
                description = "Here should be content",
                resourceUrl = "https://www.kalzumeus.com"
            ))
        }

        return rescourceItems
    }


}