package com.example.finalandroid

import javax.xml.transform.Source

data class Info(
        val author: String,
        val content: String,
        val title: String,
        val url: String,
        val urlToImage: String,
        val description: String,
        val publishedAt: String,
        val source: Source)