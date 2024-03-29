package com.example.makemon.network.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {
    @GET("search/{type}")
    fun getSearchResult(
        @Header("X-Naver-Client-Id") id: String?,
        @Header("X-Naver-Client-Secret") pw: String?,
        @Path("type") type: String?,
        @Query("query") query: String?,
        @Query("display") display: Int?
    ): Call<String?>?
}