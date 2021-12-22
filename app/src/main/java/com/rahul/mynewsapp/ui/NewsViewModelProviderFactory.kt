package com.rahul.mynewsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rahul.mynewsapp.repository.NewsRepository
import javax.inject.Inject


class NewsViewModelProviderFactory(
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel > create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}