package com.rahul.mynewsapp.repository

import com.rahul.mynewsapp.api.RetrofitInstance
import com.rahul.mynewsapp.database.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}