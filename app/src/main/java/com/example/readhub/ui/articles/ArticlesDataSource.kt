package com.example.readhub.ui.articles

import android.content.Context
import com.example.readhub.R

object ArticlesDataSource {
    val articleItems = mutableListOf<ArticleItem>()
    fun getItems(context: Context): List<ArticleItem> {
        if (articleItems.isNotEmpty()) return articleItems

        for (i in 1..10) {
            articleItems.add(
                ArticleItem(
                    title = "Title $i",
                    author = "Author $i",
                    content = context.getString(R.string.lorem_ipsum)
                )
            )
        }
        return articleItems
    }

}