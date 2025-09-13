package com.example.readhub.ui.books

import android.content.Context
import com.example.readhub.R

object BooksDataSource {
    val bookItems = mutableListOf<BookItem>()

    fun getItems(context: Context): List<BookItem> {
        if (bookItems.isNotEmpty()) return bookItems

        for (i in 0..50){
            bookItems.add(
                BookItem(
                    title = "Ikki Eshik Orasi",
                    author = "Utkir Hoshimov",
                    image = R.drawable.sample_book_img,
                    description = context.getString(R.string.sample_book_description),
                    downloadUrl = "https://example.com/ikki_eshik_orasi.pdf"
                )
            )

        }

        return bookItems
    }

}