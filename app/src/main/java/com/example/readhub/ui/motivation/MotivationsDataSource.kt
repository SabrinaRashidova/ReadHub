package com.example.readhub.ui.motivation

import android.content.Context
import com.example.readhub.R

object MotivationsDataSource {

    val motivationItems = mutableListOf<MotivationItem>()

    fun getitems(context: Context): List<MotivationItem> {
        if (motivationItems.isNotEmpty()) return motivationItems

        motivationItems.add(MotivationItem("Sam Levenson","Don’t watch the clock; do what it does. Keep going", R.drawable.motivation_img))
        motivationItems.add(MotivationItem("Sam Levenson","Success does not come overnight. It comes to those who keep going, even when the road is difficult, even when no one believes in them. The harder you strive, the brighter your future becomes, because fortune always favors the one who refuses to give up."))
        motivationItems.add(MotivationItem("Sam Levenson","Every great achievement begins with the decision to try. When you put in the effort, even the smallest step forward, life itself finds ways to reward you. Opportunities open, doors appear, and luck seems to shine—because effort attracts fortune"))
        motivationItems.add(MotivationItem("Sam Levenson","Don’t watch the clock; do what it does. Keep going", R.drawable.motivation_img))
        motivationItems.add(MotivationItem("Sam Levenson","Success does not come overnight. It comes to those who keep going, even when the road is difficult, even when no one believes in them. The harder you strive, the brighter your future becomes, because fortune always favors the one who refuses to give up."))
        motivationItems.add(MotivationItem("Sam Levenson","Every great achievement begins with the decision to try. When you put in the effort, even the smallest step forward, life itself finds ways to reward you. Opportunities open, doors appear, and luck seems to shine—because effort attracts fortune"))
        motivationItems.add(MotivationItem("Sam Levenson","Don’t watch the clock; do what it does. Keep going", R.drawable.motivation_img))
        motivationItems.add(MotivationItem("Sam Levenson","Success does not come overnight. It comes to those who keep going, even when the road is difficult, even when no one believes in them. The harder you strive, the brighter your future becomes, because fortune always favors the one who refuses to give up."))
        motivationItems.add(MotivationItem("Sam Levenson","Every great achievement begins with the decision to try. When you put in the effort, even the smallest step forward, life itself finds ways to reward you. Opportunities open, doors appear, and luck seems to shine—because effort attracts fortune"))
        motivationItems.add(MotivationItem("Sam Levenson","Don’t watch the clock; do what it does. Keep going", R.drawable.motivation_img))
        motivationItems.add(MotivationItem("Sam Levenson","Success does not come overnight. It comes to those who keep going, even when the road is difficult, even when no one believes in them. The harder you strive, the brighter your future becomes, because fortune always favors the one who refuses to give up."))
        motivationItems.add(MotivationItem("Sam Levenson","Every great achievement begins with the decision to try. When you put in the effort, even the smallest step forward, life itself finds ways to reward you. Opportunities open, doors appear, and luck seems to shine—because effort attracts fortune"))




        return motivationItems
    }

}