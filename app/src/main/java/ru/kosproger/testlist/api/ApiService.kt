package ru.kosproger.testlist.api

import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getInfo(): List<InfoClass>
}