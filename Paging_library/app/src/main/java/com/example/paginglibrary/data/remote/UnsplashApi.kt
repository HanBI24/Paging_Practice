package com.example.paginglibrary.data.remote

import com.example.paginglibrary.BuildConfig
import com.example.paginglibrary.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>
}