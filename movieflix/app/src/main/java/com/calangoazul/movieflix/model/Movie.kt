package com.calangoazul.movieflix.model

data class Movie (
    var id: Int,
    var title: String,
    var subTitle: String,
    var year: Int,
    var synopsis: String,
    var note: Int,
    var genre: String,
)